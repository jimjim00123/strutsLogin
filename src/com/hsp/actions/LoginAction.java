package com.hsp.actions;
//�o�O�@��Action(�p����,���~��Action)

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hsp.forms.UserForm;

public class LoginAction extends Action {
	//�ڭ̻ݭn���g�@�Ӥ�k:execute�|�Q�۰ʽե�, ���I����Servlet��service��k
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//��form�ন������UserForm��H
		UserForm userForm = (UserForm)form;
		System.out.println("�Τ�W="+userForm.getUsername());
		
		return null;
	}
	
	
	
}
