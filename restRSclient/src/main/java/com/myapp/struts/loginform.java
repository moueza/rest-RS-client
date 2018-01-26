package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/** https://javabeat.net/struts-html-errors-tag-htmlerrors/ 
 * Form bean*/
public class loginform extends org.apache.struts.action.ActionForm {

	private String uname;
	private String password;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public loginform() {
		super();

	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) { // to check and set the error
																						// messages
		ActionErrors errors = new ActionErrors();
		if (uname == null || uname.length() < 1) {

			errors.add("uname", new ActionMessage("errors.uname.required"));

		}
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("errors.password.required"));

		}
		return errors;
	}
}