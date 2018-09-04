package com.hl95.test.utils.enums;

/**
 * 枚举的公共接口
 * @author renchao
 *
 * @param <V>
 */
public interface BaseEnums<V> {
	//获取实际值
	V getValue();
	//显示值
	V getText();
}
