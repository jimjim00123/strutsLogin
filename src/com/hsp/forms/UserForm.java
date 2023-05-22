package com.hsp.forms;
//這是用戶表單, 用於填充數據

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	
	//定義屬性 [這裡有個規範, 就是我們定義屬性名字時,應該和jsp頁面控件名稱一樣]
	//Q1  如有人提問, 說這個表單的屬性表單名字一定和控件銘一樣? 
	//A1 只要保證set、get方法和屬性名存在相關即可
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
