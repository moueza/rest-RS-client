<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!-- https://javabeat.net/struts-html-errors-tag-htmlerrors/ -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Login Success Page </title>
    </head>
    <body bgcolor="#DDDDDD">
	 <h1> Login Success </h1>
       <h2> <bean:write name="loginform" property="message" filter="false"/> </h2>
       </body>
</html>ml>