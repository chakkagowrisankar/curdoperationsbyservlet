<%@page import="dao.UserDao"%>
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
	<%int id =(int)request.getAttribute("id"); %>
	<%
	UserDao ud =new UserDao(); 
	User u=ud.find(id);
	%>
	<form action="update1">
		<fieldset>
		<legend>User details</legend>
			<label>Enter your first name:</label>
			<input type="text" name="fname" value=<%u.getFName(); %> placeholder="Enter your first name"><br> 
			<label>Enter your last name:</label>
			<input type="text" name="lname" value=<%u.getLName();%>placeholder="Enter your last name"><br>
			<label>Enter your surname:</label> 
			<input type="text" name="surname" value=<%u.getSurName();%> placeholder="Enter your surname"><br> 
			<label>Enter your email:</label> 
			<input type="email" name="email" value=<%u.getEmail();%> placeholder="Enter your email"><br> 
			<label>Enter your password:</label> 
			<input type="password" name="password" value=<%u.getPassword();%> placeholder="Enter your password"><br> 
			<label>Enter your age:</label> 
			<input type="number" name="age" value=<%u.getAge();%> placeholder="Enter your age"><br> 
			<label>Enter your phone number:</label> 
			<input type="number" name="phone" value=<%u.getPhoneNumber();%> placeholder="Enter your phone number"><br> 
			<label>Enter your gender:</label> 
			<input type="text" name="gender" value=<%u.getGender();%> placeholder="Enter your gender"><br> 
			<label>Enter your Date of birth:</label>
			<input type="date" name="dob" value=<%u.getDob();%> placeholder="Enter your Date of birth"><br>
			<button>submit</button>


		</fieldset>

	</form>

</body>
</html>