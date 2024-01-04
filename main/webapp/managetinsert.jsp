<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Manager Details</title>
</head>
<body>
	<div class="manager-details">
		<h1>Insert Manager Details</h1>
		<form action="insert" method="post">
			<table class="insert-table">
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="psw"></td>
				</tr>
				<tr>
					<td>PhoneNo</td>
					<td><input type="text" name="phone"></td>
				</tr>
			</table>
			<input type="submit" name="submit" value="Create Manager Account">
		</form>

	</div>
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
	border: 1px solid blue;
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
	color: blue;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	margin: 10px;
}
</style>
</body>
</html>