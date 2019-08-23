<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
		<form>
			<div class="form-group">
				<label for="username">Username:</label>
				<input type="text" class="form-control" id="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label>
				<input type="password" class="form-control" id="pwd">
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<div>
				<button type="submit" class="btn btn-default">Submit</button>
				<button type="submit" class="btn btn-default">Create account</button>
			</div>
			
		</form>
	</div>
	
</body>
</html>