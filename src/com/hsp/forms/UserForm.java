package com.hsp.forms;
//�o�O�Τ���, �Ω��R�ƾ�

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {
	
	//�w�q�ݩ� [�o�̦��ӳW�d, �N�O�ڭ̩w�q�ݩʦW�r��,���өMjsp��������W�٤@��]
	//Q1  �p���H����, ���o�Ӫ�檺�ݩʪ��W�r�@�w�M����ʤ@��? 
	//A1 �u�n�O��set�Bget��k�M�ݩʦW�s�b�����Y�i
	
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
