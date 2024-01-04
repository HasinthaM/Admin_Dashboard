<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Account</title>
<style>

/* CSS styling for the page */

* {
	margin: 0;
	padding: 0;
	font-family: Arial, Helvetica, sans-serif;
}

body {
	height: 150v;
}

.container {
	display: flex;
	flex-direction: row;
}

.content {
	margin-top: 80px;
	margin-left: 30px;
	display: flex;
	flex: 1;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.nav-bar {
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	margin-bottom: 20px;
	position: fixed;
	height: 60px;
	top: 0;
	left: 0;
	right: 0;
	background-color: black;
}

form {
	display: flex;
	flex-direction: column;
 }
 
 input {
 	padding: 5px 10px;
    margin-bottom: 10px;
    font-size: 20px;
 }

.logo {
	width: 50px;
	height: 25px;
	margin: 10px;
}

h1 {
	margin-bottom: 10px;
}

label {
	margin-bottom: 5px;
	font-size: 20px;
}

.delete {
	background-color: red;
	margin: 10px;
	padding: 10px 20px;
	border-radius: 5px;
	border-style: none;
	font-weight: 700;
	cursor: pointer;
}

.delete:hover {
	background-color: rgb(233, 63, 63);
}
</style>
</head>
<body>

	<%
	
	// Retrieve request parameters
	
		String iD = request.getParameter("mId");
		String firstName = request.getParameter("mfName");
		String lastName = request.getParameter("mlName");
		String userName = request.getParameter("mUName");
		String Email = request.getParameter("mEmail");
		String userPass = request.getParameter("mPass");
		String phoneNo = request.getParameter("mPhone");
	%>
	<div class="container">
		<div class="nav-bar">
			<div class="img">
				<img class="logo" src="logo.png">
			</div>
		</div>
		<div class="content">
			<form action="delete" method="post">

				<h1>Account Delete</h1>

				<label>Manager Id :</label>
				<input type="text" name="manid" value="<%= iD %>" readonly>
				
				<label>Manager First Name :</label>
				<input type="text" name="fname" value="<%= firstName %>"readonly>
				
				<label>Manager Last Name :</label>
				<input type="text" name="lname" value="<%= lastName %>" readonly>
				
				<label>User Name :</label>
				<input type="text" name="uname" value="<%= userName %>" readonly>
				
				<label>Email :</label>
				<input type="text" name="email" value="<%= Email %>" readonly>
				
				<label>Password :</label>
				<input type="text" name="pass" value="<%= userPass %>" readonly>
				
				<label>Phone No :</label>
				<input type="text" name="phone" value="<%= phoneNo %>" readonly>

				<button name="submit" class="delete">Delete Account</button>

			</form>
		</div>
	</div>





</body>
</html>