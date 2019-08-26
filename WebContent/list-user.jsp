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
                        <th scope="col">Delete</th>
                        <th scope="col">Edit</th>
                    </tr>
                </thead>
                <tbody>
                	<% int index = 0; %>
                	<c:forEach var="user" items="${listUser}">
                	<tr>
                        <th scope="row"><%=index %></th>
                        <td>${user.username}</td>
                        <td>${user.email}</td>
                        <c:choose>
                        	<c:when test="${user.gender == 0}">
                        		<td>Nam</td>
                        	</c:when>
                        	<c:when test="${user.gender == 1}">
                        		<td>Nữ</td>
                        	</c:when>
                        	<c:otherwise>
                        		<td>Khác</td>
                        	</c:otherwise>
                        </c:choose>
                        <td>${user.password}</td>
                        <td>
                        	<a href="${pageContext.request.contextPath}/delete?username=${user.username}"
                        	onclick="return confirm('Are you sure you want to delete this item?');">
								<img class="icon" alt="xóa" src="images/delete.png">
							</a>
                        </td>
                        <td>
                        	<a href="${pageContext.request.contextPath}/edit?username=${user.username}">
								<img class="icon" alt="xóa" src="images/edit.png">
							</a>
                        </td>
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