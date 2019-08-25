<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <a class="navbar-brand" href="#">${WebSiteName}</a>
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
        <h1>User: ${name}</h1>
        <a href="/ServlerExercise/logout">Đăng xuất</a>
        <a href="/ServlerExercise/changepass">Đổi mật khẩu</a>
        <div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Username</th>
                        <th scope="col">Email</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Password</th>
                    </tr>
                </thead>
                <tbody>
                	<% int index = 0; %>
                	<c:forEach var="user" items="${listUser}">
                	<tr>
                        <th scope="row"><%=index %></th>
                        <td>${user.username}</td>
                        <td>${user.email}</td>
                        <td>${user.gender}</td>
                        <td>${user.password}</td>
                    </tr>
                	<% index++; %>
                		
                	</c:forEach>
                	
                    <!-- <tr>
                        <th scope="row">1</th>
                        <td>Nguyen Van A</td>
                        <td>nguyenvana@gmail.com</td>
                        <td>Man</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Tran Van B</td>
                        <td>tanvanb@gmail.com</td>
                        <td>Man</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Le Thi C</td>
                        <td>lethic@gmail.com</td>
                        <td>Women</td>
                    </tr>
                     -->
                </tbody>
            </table>
        </div>
	
</body>
</html>