package org.eclipsebook.ch10;

import javax.servlet.jsp.tagext.TagSupport;

public class Ch10_02 extends TagSupport {
	public int doStartTag() {
		String[] typeArray = { "", "pizza", "calzone", "sandwich" };
		pageContext.setAttribute("type", typeArray);

		return SKIP_BODY;
	}
}
