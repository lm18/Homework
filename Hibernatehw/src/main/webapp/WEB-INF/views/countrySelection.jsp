<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15.04.2017
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
Выберите страну:
<form:form action="/countrySearch" method="post">
<input type="text" name="search" id="search">
<input class="btn btn-success" type='submit' value="${countrySearch}"/>
</form:form>
<a href="<c:url value='/j_spring_security_logout'/>"/>Выход</a>
</body>
</html>
