package org.eclipsebook.ch10;

import javax.servlet.jsp.tagext.TagSupport;

public class Ch10_03 extends TagSupport {
	public int doStartTag() {
		String[] itemsArray = { "saucisse", "fromage", "anchois", "boulettes de viande", "grains de poivre" };
		pageContext.setAttribute("items", itemsArray);

		return SKIP_BODY;
	}
}
