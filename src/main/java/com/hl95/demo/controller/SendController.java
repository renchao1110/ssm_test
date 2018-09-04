package com.hl95.demo.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hl95.demo.entity.User;
import com.hl95.demo.service.LowerService;
import com.hl95.demo.service.UserService;
import com.hl95.demo.utils.MessageEnums;
import com.hl95.demo.utils.SendMsg;
import com.hl95.demo.utils.StringUtil;
import com.hl95.test.utils.ParamsValidate;

@Controller
public class SendController extends BaseController{
	private static Logger logger = Logger.getLogger(SendController.class);
	private static final String url = "http://q.hl95.com:8061";
	@Autowired
	private LowerService lowerService;
	@Autowired
	private UserService userService;
	@RequestMapping(value="/sendMessage",method=RequestMethod.POST)
	@ResponseBody
	public String sendMessage(@RequestParam Map<String, Object> param){
		
		//得到客户提交过来的参数信息
		//Map<String, Object> params = this.getParams(getRequest());
		Map<String, Object> params = ParamsValidate.getParams(getRequest());
		logger.info("请求参数==========()()()())()()(()==============="+params);
		//1、参数校验
		MessageEnums validateParams = this.validateParams(params);
		
		//添加访问记录
		logger.info("请求参数========================="+params);
		if(!MessageEnums.MessageEnums_08.getText().equals(validateParams.getText())) {
			logger.error(params);
			return "params is error";
		}
//		if(!MessageEnums.MessageEnums_08.equals(validateParams)) {
//			logger.error(params);
//			return "params is error";
//		}
		
		//2、IP鉴权
		String remoteHost = this.getRemoteHost(getRequest());
		User user = userService.getUserByIp(remoteHost);
		if(user==null) {
			logger.error(params);
			return "ERR IP:"+remoteHost;
		}
		String pstr = "";
		/*if(params!=null&&params.size()>0){
			for(Map.Entry<String, Object> entry : params.entrySet()){
				String key = entry.getKey();
				String value = (String)entry.getValue();
				if("message".equals(entry.getKey())){
					try {
						value = URLEncoder.encode(value,"GBK");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				}
				pstr+="&"+ key+"="+value;
			}
			pstr = pstr.substring(1);
		}*/
		
		String state = "";
		
		//state = SendMsg.sendGet(url+"?"+pstr);
		params.get("message");
		state = SendMsg.sendPost(url,params);
		params.put("state", state);
		
		int saveMsg = lowerService.saveMsg(params);
		
		return state;
	}
	
	
	
	
	/**
	 * 请求参数完整性校验
	 * @param params 参数值
	 * @return boolean 校验结果
	 */
	private MessageEnums validateParams(Map<String, Object> params) {
		
		//添加访问记录
		logger.info("请求参数="+params);
		Pattern pattern = Pattern.compile("^-?[0-9]+");
        
		String userName = StringUtil.toString(params.get("username"));	//用户账号
		String passWord = StringUtil.toString(params.get("password"));	//用户密码
		String phone  = StringUtil.toString(params.get("phone"));		//电话号码
		String linkId = StringUtil.toString(params.get("linkid"));		//linkId
		String subcode = StringUtil.toString(params.get("subcode"));	//非必填，用户扩展码
		String epid = StringUtil.toString(params.get("epid"));		//linkId
		
		//非空字段不允许为空
		if(StringUtil.isBlank(userName)||StringUtil.isBlank(passWord)||StringUtil.isBlank(phone)||StringUtil.isBlank(linkId)||StringUtil.isBlank(epid)) {
			
			return MessageEnums.MessageEnums_01;
		}
		//手机格式不正常
		if(phone.length()!=11&&!pattern.matcher(phone).matches()) {
			
			return MessageEnums.MessageEnums_10;
		}
		
		if(!pattern.matcher(phone).matches()){
			return MessageEnums.MessageEnums_11;
		}
		//linkId超长
		if(linkId.length()>20&&!pattern.matcher(phone).matches()) {
			
			return MessageEnums.MessageEnums_11;
		}
		//subcode超长
		if(StringUtil.isNotBlank(subcode)&&subcode.length()>10) {
			
			return MessageEnums.MessageEnums_12;
		}
		
		/*//必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信模板-可在短信控制台中找到
        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId(linkId);*/
		
		return MessageEnums.MessageEnums_08;
	}
}
