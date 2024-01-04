<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script>
        function validateForm() {
            var username = document.getElementById("uid").value;
            var password = document.getElementById("pass").value;

            if (username === "" || password === "") {
                alert("Username and password are required");
                return false;
            }

            // Send  request to the server for validation
            var valid = new XMLHttpRequest();
            valid.open("POST", "validate.php", true);
            valid.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

            valid.onreadystatechange = function () {
                if (valid.readyState === 4 && valid.status === 200) {
                    var response = valid.responseText;

                    if (response === "success") {
                        
                        document.getElementById("login-form").submit();
                    } else {
                        alert("Invalid username or password");
                    }
                }
            };

            var data = "uid=" + encodeURIComponent(username) + "&pass=" + encodeURIComponent(password);
            xhr.send(data);

            return false; // Prevent the form from submitting here
        }
    </script>

</head>
<body>
	
	<div class="login-container"> 
		<form action="log" method="post" id="login-form">
			<h2>Admin Login</h2>
			<div class="input-container">
				<label for="uid">User Name</label> <input type="text" id="uid"
					name="uid" required>
			</div>
			<div class="input-container">
				<label for="pass">Password</label> <input type="password" id="pass"
					name="pass" required>
			</div>
			<button type="submit" name="submit">Login</button>
		</form>
	</div>

</body>

<style>
/*CSS part fro login page*/
body {
	background: #f1f1f1; /* Background color */
	font-family: Arial, sans-serif;
	margin: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.login-container {
	background: white;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	text-align: center;
	padding: 20px;
}

h2 {
	color: #007acc; /* Title color */
}

.input-container {
	text-align: left;
	margin: 15px 0;
}

label {
	display: block;
	font-weight: bold;
	color: #555; /* Label color */
}

input {
	width: 90%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 16px;
	outline: none;
}

button {
	background: #007acc; /* Button color */
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 18px;
	margin-top: 15px;
}
</style>


</body>
</html>