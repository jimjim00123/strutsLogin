package com.hsp.actions;
//這是一個Action(小隊長,需繼承Action)

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hsp.forms.UserForm;

public class LoginAction extends Action {
	//我們需要重寫一個方法:execute會被自動調用, 有點類似Servlet的service方法
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//把form轉成對應的UserForm對象
		UserForm userForm = (UserForm)form;
		System.out.println("用戶名="+userForm.getUsername());
		
		return null;
	}
	
	
	
}
