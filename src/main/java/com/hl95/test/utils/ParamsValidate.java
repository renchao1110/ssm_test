package com.hl95.test.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hl95.test.utils.enums.MessageEnums;

public class ParamsValidate {
	
	private static Logger logger = Logger.getLogger(ParamsValidate.class);
	
	public static Map<String,Object> getParams(HttpServletRequest request) {
		Map<String,Object> params = new HashMap<String, Object>();
		String method = request.getMethod();  
		String remoteHost = getRemoteHost(request);
		params.put("remoteHost", remoteHost);
        Enumeration<?> keys = request.getParameterNames();  
        while (keys.hasMoreElements()) {  
            Object key = keys.nextElement();  
            if(key!=null){  
                if (key instanceof String) {  
                    String value = request.getParameter(key.toString());  
                    try {
                    	value = URLDecoder.decode(value,"GBK");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
                   
                    /*if("GET".equals(method)){
                         try {  
                        	//前台encodeURIComponent('中文');转码后到后台还是ISO-8859-1，所以还需要转码  
                            value =new String(value.getBytes("ISO-8859-1"),"GBK");  
                        } catch (UnsupportedEncodingException e) {  
                            e.printStackTrace();  
                        }      
                    }  */
                    params.put(key.toString(), value);  
                }  
            }   
        }  
		return params;
	}
	
	
	public static MessageEnums validateParams(Map<String, Object> params) {
		//添加访问记录
		logger.info("请求参数="+params);
		
		String userName = StringUtils.toString(params.get("username"));	//用户账号
		String passWord = StringUtils.toString(params.get("password"));	//用户密码
		String phone  = StringUtils.toString(params.get("phone"));		//电话号码
		String message  = StringUtils.toString(params.get("message"));  //短信内容
		String epid  = StringUtils.toString(params.get("epid"));        //企业ID
		String linkId = StringUtils.toString(params.get("linkid"));		//linkId
		String subcode = StringUtils.toString(params.get("subcode"));	//非必填，用户扩展码
		
		//非空字段不允许为空
		if(StringUtils.isBlank(userName)||StringUtils.isBlank(passWord)||StringUtils.isBlank(phone)
				||StringUtils.isBlank(message)||StringUtils.isBlank(epid)) {
			return MessageEnums.MessageEnums_01;
		}
		
		//手机格式不正常
		if(phone.length()!=11) {
			return MessageEnums.MessageEnums_10;
		}
		
		//message超长
		if(StringUtils.isNotBlank(message)&&message.length()>500) {
			return MessageEnums.MessageEnums_14;
		}
				
		//linkId超长
		if(StringUtils.isNotBlank(linkId)&&linkId.length()>20) {
			return MessageEnums.MessageEnums_11;
		}
		
		//subcode超长
		if(StringUtils.isNotBlank(subcode)&&subcode.length()>10) {
			return MessageEnums.MessageEnums_12;
		}
		
		return MessageEnums.MessageEnums_08;
	}
	
	/**
	 * 得到request对象
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		return request;
	}
	
	
	/**
	 * 获取客户端IP
	 * @param request
	 * @return
	 */
	public static String getRemoteHost(HttpServletRequest request){
		
	    String ip = request.getHeader("x-forwarded-for");
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getRemoteAddr();
	    }
	    return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
	}
	
}
