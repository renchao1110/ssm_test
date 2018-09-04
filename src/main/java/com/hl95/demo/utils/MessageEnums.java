package com.hl95.demo.utils;


/**
 * 
 * @author chenYan
 *
 */
public enum MessageEnums implements BaseEnums<String>{
	
	//系统参数类型枚举
	MessageEnums_00("OK", "请求成功！"), 
	MessageEnums_01("isv.INVALID_PARAMETERS", "参数不完整，请检查所带的参数名以及格式是否都正确 ！"),
	MessageEnums_02("isv.IP_NOT_FOUND", "IP鉴权失败,请联系管理员！"),
	MessageEnums_03("isv.USER_NOT_FOUND", "用户身份校验失败，请核对您的用户名和密码！"),
	MessageEnums_04("isv.FAILED", "发送失败!"),
	MessageEnums_05("isv.SMS_TEMPLATE_ILLEGAL", "模板不合法!"),
	MessageEnums_06("isv.USER_OUT_SERVICE", "用户已经停用！"),
	MessageEnums_07("isv.USER_BLACK_LIST", "黑名单用户！"),
	MessageEnums_08("isv.VALIDATE_SUSSCES", "参数校验成功"),
	MessageEnums_09("isv.USER_BALACE_LESS", "用户账户余额不足！"),
	MessageEnums_10("isv.PHONE_FORM_ERROR","手机号格式正确"),
	MessageEnums_11("isv.LINKID_TOO_LONG","linkId不能超出50位"),
	MessageEnums_12("isv.SUBCODE_TOO_LONG","subcode不能超出5位"),
	MessageEnums_13("isv.SIGNNAME_NOT_FOUND","模板不存在");

	/** 状态key */
	private String value;
	/** 状态值 */
	private String text;
	
	
	private MessageEnums (String value, String text){
		this.value = value;
		this.text = text;
	}
	
    public String getValue() {
		return this.value;
	}

    public String getText() {
		return this.text;
	}
	
}
