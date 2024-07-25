<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String [] s={"red","green","blue","yellow","purple"};%>
	<%for(int i=0;i<s.length;i++){ %>
	<% if(i==0){%>
		<h3 style="color:red; "><%=s[i] %></h3>
	<%} %>
	<% if(i==1){%>
		<h3 style="color:green; "><%=s[i] %></h3>
	<%} %>
	<% if(i==2){%>
		<h3 style="color:blue; "><%=s[i] %></h3>
	<%} %>
	<% if(i==3){%>
		<h3 style="color:yellow; "><%=s[i] %></h3>
	<%} %>
	<% if(i==4){%>
		<h3 style="color:purple; "><%=s[i] %></h3>
	<%} %>
	<%} %>
</body>
</html>