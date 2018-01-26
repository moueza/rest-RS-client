<%@page contentType="text/html;charset=UTF-8" language="java"%>

<!--%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"% -->
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>

<!-- <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" -->
<!-- https://www.experts-exchange.com/questions/23412830/cannot-find-the-tag-library-descriptor-for-http-jakarta-apache-org-struts-tags-html.html -->
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

<!--  %@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"% -->
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>


<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
<!--  %@ taglib uri="http://jakarta.apache.org/struts/tags-template" prefix="template" %>  cf last one for Struts 2 
 https://stackoverflow.com/questions/27597403/migrate-struts-1-tags-to-struts-2-->
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested"
	prefix="nested"%>

<!-- https://stackoverflow.com/questions/11388166/struts-2-custom-tag-library -->
<!-- %@taglib uri="/Ch10" prefix="Ch10"%>  -->


<%-- <%@ taglib prefix="s" uri="/struts-tags"%> --%>

<!-- <%@ taglib uri="/WEB-INF/Ch10.tld" prefix="Ch10" --%>
<%@ taglib uri="/main/webapp/WEB-INF/Ch10.tld" prefix="Ch10"%>

<!--  TODO JSTL-->
<!-- http://www.oreilly.com/catalogue/2841772640.html -->
<!-- https://books.google.fr/books?id=64o6brdqSt0C&pg=PR13&lpg=PR13&dq=http://www.oreilly.com/catalogue/2841772640.html&source=bl&ots=AAx_g-V1IP&sig=KUPqOJiR1SgIww6XjIDWDv1w6cc&hl=en&sa=X&ved=0ahUKEwjWzdDcmvLYAhXJuRQKHb9gDBkQ6AEIKTAA#v=onepage&q=http%3A%2F%2Fwww.oreilly.com%2Fcatalogue%2F2841772640.html&f=false -->
<html>
<head>
<title>Voici le menu...</title>
</head>
<body>
	<h1>Voici le menu...</h1>
<!-- 	html:errors></html:errors -->
	<Ch10:type />
	<Ch10:items />

	<html:form action="Ch10_04.do">
	   <span style="color:red">
        <html:errors/>
        <!-- https://javabeat.net/struts-html-errors-tag-htmlerrors/ -->
        </span>
		<TABLE>
			<TR>
				<TD align="left" valign="top"><bean:message key="items" /> <BR>
					<logic:iterate id="items1" name="items">
						<html:multibox property="items">
							<%=items1%>
						</html:multibox>
						<%=items1%>
						<BR>
					</logic:iterate></TD>

				<TD align="left" valign="top"><bean:message key="type" /> <br>
					<html:select property="type">
						<html:options name="type" />
					</html:select></TD>
			</TR>
			<tr>
				<TD align="left"><br> <bean:message key="email" /> <html:text
						property="email" /></TD>
			</tr>
		</TABLE>
		<br>
		<html:submit value="Envoyer votre commande" />
	</html:form>
</body>
</html>