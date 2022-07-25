<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<%
Enumeration en=session.getAttributeNames();
while(en.hasMoreElements()){
	String name=en.nextElement().toString();
	String value=session.getAttribute(name).toString();
	if(name.equals("action") || name.equals("nextshop") ||name.equals("shop")){}
	else{
		out.println("<h1>"+name+":"+value+"</h1>");
	}
	
}
%>
</body>
</html>





