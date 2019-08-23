<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">		
	<title></title>
	<<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
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
        <div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Username</th>
                        <th scope="col">Email</th>
                        <th scope="col">Gender</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td><%=pageContext.getServletConfig().getInitParameter("aaa") %></td>
                        <td>Tran Van B</td>
                        <td>Nguyen Thi C</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>nguyenvana@gmail.com</td>
                        <td>tanvanb@gmail.com</td>
                        <td>nguyenthic@gmail.com</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Men</td>
                        <td>Men</td>
                        <td>Women</td>
                    </tr>
                </tbody>
            </table>
        </div>
        
              
	
</body>
</html>