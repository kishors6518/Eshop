<%@page import="java.util.List"%>
<%@page import="eshop.EshopBussinessLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="eshop.EshopBussinessLogic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	EshopBussinessLogic eb=new EshopBussinessLogic();
	List<String> mobiles=eb.getMobiles();
	
	List<String> laptops=eb.getLaptops();
	
	List<String> tvs=eb.getTVs();
	
	out.print("<h3>*******Mobiles********</h3>");
	for(String m: mobiles)
	{
		out.print(m+"<br>");
	}
	
	out.print("<h3>*******Laptops********</h3>");
	for(String l: laptops)
	{
		out.print(l+"<br>");
	}
	
	out.print("<h3>*******TV********</h3>");
	for(String t: tvs)
	{
		out.print(t+"<br>");
	}
%>

</body>
</html>