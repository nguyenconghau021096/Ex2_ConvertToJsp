<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script>
	
	
	function validate() {
		var username = document.getElementsByName('username')[0].value;
		var password = document.getElementsByName('password')[0].value;
		var email = document.getElementsByName('email')[0].value;
		
		if (username != "" && password != "" && email != "" ){
			return true;
		} else {
			alert('Chưa nhập đủ thông tin');
			return false;
		}
	}
	</script>
</head>
<body>
    <div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Page 1</a></li>
                    <li><a href="#">Page 2</a></li>
                    <li><a href="#">Page 3</a></li>
                </ul>
            </div>
        </nav>
    </div>
		
	<div class="form">
		<form method="post" action="/ServlerExercise/edit" onsubmit="return validate()">
			<div class="form-group">
				<h3>Username:${username}</h3>
				<input type="hidden" class="form-control" name="username" value="${username}">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" class="form-control" name="email" value="${email}">
            </div>
			<div class="form-group">
				<label for="password">Password:</label>
				<input type="password" class="form-control" name="password" value="${password}">
            </div>
            <div class="radio">
                <label><input type="radio" name="gender" checked value="0">Men</label>
                <label><input type="radio" name="gender" value="1">Women</label>
                <label><input type="radio" name="gender" value="2">Other</label>
            </div>
			<div>
				<button type="submit" class="btn btn-default">Change</button>
				<span id='message'></span>
			</div>
		</form>
	</div>
</body>
</html>