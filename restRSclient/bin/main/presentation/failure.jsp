<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>

< html> < head> < meta http-equiv="Content-Type" content="text/html;
charset=UTF-8"> < title> Login Failure Page
</title>
</head>
< body bgcolor="#DDDDDD"> < h1> Login Failed
</h1>
< h2> < span style='color:red'>< bean:write name="loginform"
property="message" filter="false"/> < span> < /h2>
</body>
</html>
