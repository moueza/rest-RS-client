<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<%@taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>HTML Errors example</title>
<head>
<body bgcolor="DDDDDD">

	<!--  https://javabeat.net/struts-html-errors-tag-htmlerrors/ -->
	<h1>Struts html:errors/html:password Tag</h1>
	<html:form action="/login">
		<span style="color: red"> <html:errors />
		</span>
        Enter User Name:<html:text name="loginform" property="uname" />
		<br>
        Enter Password:<html:password name="loginform"
			property="password" />
		<br>
		<html:submit />
		<html:reset />
	</html:form>
</body>
</html>