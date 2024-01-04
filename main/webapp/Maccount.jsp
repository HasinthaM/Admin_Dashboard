<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Account</title>
<style type="text/css">
	
	* {
    margin: 0;
    padding: 0;
    font-family: Arial, Helvetica, sans-serif;
}

body {
    height: 150v;
}

.container{
    display: flex;
    flex-direction: row;
}

.content{
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

.logo{
    width: 50px;
    height: 25px;
    margin: 10px;
}

.complains{
    margin: 10px;
    padding: 10px;
    background-color: brown;
    border-radius: 5px;
    border-style: none;
    font-weight: 700;
    cursor: pointer;
}

.complains:hover{
    background-color: rgb(173, 58, 58);
}

h1{
    margin-bottom: 10px;
}

.lab{
    margin-bottom: 5px;
    font-size: 20px;
}

.data{
    border: 2px;
    border-style:solid;
    padding: 5px 10px;
    margin-bottom: 10px;
    font-size: 20px;
}

.info{
    display: flex;
    flex-direction: column;
}

.update{
    background-color: green;
    margin: 10px;
    padding: 10px 20px;
    border-radius: 5px;
    border-style: none;
    font-weight: 700;
    cursor: pointer;
}

.update:hover{
    background-color: rgb(39, 158, 39);
}

.delete{
    background-color: red;
    margin: 10px;
    padding: 10px 20px;
    border-radius: 5px;
    border-style: none;
    font-weight: 700;
    cursor: pointer;
}

.delete:hover{
    background-color: rgb(233, 63, 63);
}
	
</style>
</head>
<body>

	<h1>Manager Account</h1>
				<c:forEach var="man" items="${manDetails}">
				
				${man.mID}
				${man.mFirstName}
				${man.mLastName}
				${man.uName}
				${man.mEmail}
				${man.uPass}
				${man.mPhoneNo}

					<c:set var="mid" value="${man.mID}" />
					<c:set var="firstName" value="${man.mFirstName}" />
					<c:set var="lastName" value="${man.mLastName}" />
					<c:set var="userName" value="${man.uName}" />
					<c:set var="email" value="${man.mEmail}" />
					<c:set var="password" value="${man.uPass}" />
					<c:set var="phoneNo" value="${man.mPhoneNo}" />

					<label>Manager ID</label>
					<label class="data">${man.mID}</label>

					<label>Manager First Name</label>
					<label class="data">${man.mFirstName}</label>

					<label>Manager Last Name</label>
					<label class="data">${man.mLastName}</label>

					<label>Manager User Name</label>
					<label class="data">${man.uName}</label>

					<label>Manager Email</label>
					<label class="data">${man.mEmail}</label>

					<label>Manager Password</label>
					<label class="data">${man.uPass}</label>

					<label>Manager Phone</label>
					<label class="data">${man.mPhoneNo}</label>

				</c:forEach>
</body>
</html>