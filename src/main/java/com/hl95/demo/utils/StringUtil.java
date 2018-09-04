package com.hl95.demo.utils;


/**
 *
 * String 操作工具类
 * 
 * @author chenYan
 *
 */
public class StringUtil {
	
	
	/**
	 * 判断是否为空
	 * 
	 * @return
	 */
    public static boolean isBlank(Object obj) {
    	
    	if(obj==null) {
    		return true;
    	}
    	if(obj.toString().trim().length()==0) {
    		return true;
    	}
    	return false;
    }
    
    /**
	 * 判断是否为空
	 * 
	 * @return
	 */
    public static boolean isNotBlank(Object obj) {
    	
    	if(obj==null) {
    		return false;
    	}
    	if(obj.toString().trim().length()==0) {
    		return false;
    	}
    	return true;
    }
    /**
     * Object to String
     * @param obj
     * @return String or Null
     */
    public static String toString(Object obj) {
    	
    	if(obj==null) {
    		return null;
    	}
    	
    	return obj.toString();
    }
}
