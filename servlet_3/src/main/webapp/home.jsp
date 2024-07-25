<%@page import="java.util.List"%>
<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
welcome User....
<%User u =(User)request.getAttribute("user"); %>
<h3>id:<%=u.getId() %></h3>
<h3>Name:<%=u.getFName()+" "+u.getLName()+" "+u.getSurName() %></h3>
<h3>age:<%=u.getAge() %></h3>
<h3>Email:<%=u.getEmail() %></h3>
<h3>password:<%=u.getPassword() %></h3>
<h3>gender:<%=u.getGender() %></h3>
<h3>Date of birth:<%=u.getDob() %></h3>
<h3>phone number:<%=u.getPhoneNumber() %></h3> --%>
<table border="2">
	<thead>
		<tr>
		<th>id</th>
		<th>first Name</th>
		<th>Last Name</th>
		<th>SurName</th>
		<th>age</th>
		<th>Email</th>
		<th>password</th>
		<th>gender</th>
		<th>phone number</th>
		<th>date of birth</th>
		<th>update</th>
		<th>delete</th>
		</tr>
	</thead>
	<tbody>
	<%List<User> l =(List)request.getAttribute("list"); %>
	<%for(User u:l){ %>
		<tr>
		<td><%=u.getId() %></td>
		<td><%=u.getFName()%></td>
		<td><%=u.getLName()%></td>
		<td><%=u.getSurName() %></td>
		<td><%=u.getAge() %></td>
		<td><%=u.getEmail() %></td>
		<td><%=u.getPassword() %></td>
		<td><%=u.getGender() %></td>
		<td><%=u.getPhoneNumber() %></td>
		<td><%=u.getDob() %></td>
		<td><a href="update.jsp?id=<%u.getId();%>">update</a></td>
		<td><a href="delete.jsp?id=<%u.getId();%>">delete</a></td>
		</tr>
	<%} %>
	</tbody>
</table>

</body>
</html>