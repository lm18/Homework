<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.04.2017
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Вход</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/style.css" var="style"/>
    <spring:url value="/resources/css/font-awesome-min.css" var="font-awesome-min"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${style}" rel="stylesheet"/>
    <link href="${font-awesome-min}" rel="stylesheet"/>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><i class="fa fa-train" aria-hidden="true"></i>&nbsp TrainTravel</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/countries">Домой</a></li>
                <li><a href="/"><i class="fa fa-sign-out" aria-hidden="true"></i></a></li>
            </ul>
        </div>
    </div>
</div>
<form name="form_login" action="<c:url value='/j_spring_security_check'/>" method="post">
    <table>
        <tr>
            <div class="form-group">
            <td><label for="username">User:</label></td>
            <td><input type="text" name="j_username" placeholder="Имя пользователя" id="username"/></td>
            </div>
        </tr>
        <tr>
            <div class="form-group">
            <td><label for="password">Password:</label></td>
            <td><input type="password" name="j_password" placeholder="Пароль" id="password"/></td>
            </div>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Вход" class="btn-login"/></td>
        </tr>
    </table>
</form>
</body>
</html>
