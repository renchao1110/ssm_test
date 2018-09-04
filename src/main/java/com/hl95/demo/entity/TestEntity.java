package com.hl95.demo.entity;

import java.io.Serializable;

public class TestEntity implements Serializable {

	/**
	 * @author wangShimin
	 *
	 * @date 2018年8月28日
	 *
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String account;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", account=" + account + ", password=" + password + "]";
	}

}
