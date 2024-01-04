<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Admin Page</title>
</head>
<body>

	<%
		// Retrieve request parameters
	
		String id = request.getParameter("id");
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String username = request.getParameter("uname");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		String Phone = request.getParameter("phone");
	
	%>


	<div class="manager-details">
		<h1>Delete Admin Account</h1>
		<form action="delete" method="post">
			<table class="insert-table">
				<tr>
					<td>Administrator ID</td>
					<td><input type="text" name="id" value="<%=id%>" readonly></td>
				</tr>
				<tr>
					<td>Administrator FirstName</td>
					<td><input type="text" name="fname" value="<%=firstname%>"
						readonly></td>
				</tr>
				<tr>
					<td>Administrator LastName</td>
					<td><input type="text" name="lname" value="<%=lastname%>"
						readonly></td>
				</tr>
				<tr>
					<td>Administrator User Name</td>
					<td><input type="text" name="uname" value="<%=username%>"
						readonly></td>
				</tr>
				<tr>
					<td>Administrator Email</td>
					<td><input type="text" name="email" value="<%=Email%>"
						readonly></td>
				</tr>
				<tr>
					<td>Administrator Password</td>
					<td><input type="text" name="password" value="<%=Password%>"
						readonly></td>
				</tr>
				<tr>
					<td>Administrator Phone No</td>
					<td><input type="text" name="phoneno" value="<%=Phone%>"
						readonly></td>
				</tr>
			</table>
			<br> <input type="submit" name="submit"
				value="Delete Admin Account">
		</form>
	</div>

</body>

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f1f1f1;
	margin: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.manager-details {
	background: white;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	padding: 20px;
	text-align: center;
	max-width: 400px;
	width: 90%;
	margin: auto;
}

h1 {
	font-size: 24px;
	margin-bottom: 20px;
}

.insert-table {
	width: 100%;
	border-collapse: collapse;
	border: 1px solid #ddd;
}

.insert-table td {
	border: 1px solid #ddd;
	padding: 10px;
}

.insert-table input[type="text"] {
	width: 90%;
	padding: 8px;
	border: 1px solid #ddd;
	border-radius: 5px;
	margin-bottom: 10px;
}

.insert-table input[type="submit"] {
	background: #007acc; /* Button color */
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</html>