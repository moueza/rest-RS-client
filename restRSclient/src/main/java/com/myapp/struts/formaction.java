package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class formaction extends org.apache.struts.action.Action {

	/* forward name="success" path="" */
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	/**https://javabeat.net/struts-html-errors-tag-htmlerrors/*/
	public class loginaction extends org.apache.struts.action.Action {

		private final static String SUCCESS = "success";
		private final static String FAILURE = "failure";

		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			loginform formBean = (loginform) form;
			if (formBean.getUname().equals("user")) {
				if (formBean.getPassword().equals("password")) {
					formBean.setMessage("Welcome User...");
					return mapping.findForward(SUCCESS);
				} else {
					formBean.setMessage("Wrong Password");
					return mapping.findForward(FAILURE);
				}
			}
			formBean.setMessage("User Name is Not Correct");
			return mapping.findForward(FAILURE);

		}
	}
}
