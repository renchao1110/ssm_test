package com.hl95.test.entity;

import java.util.HashMap;

import com.hl95.test.utils.enums.BaseEnums;

public class ResponEntity extends HashMap<String, Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static ResponEntity getResponEnums(BaseEnums<String> enums) {
		
		ResponEntity responEntity = new ResponEntity(); 
		responEntity.put(enums.getValue(), enums.getText());
		return responEntity;
	}
}
