<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18.04.2017
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/citySearch" method="post">
    <select name="departure" id="departure">
        <c:forEach items="${tripList}" var="trip">
            <option value="${trip.departure}">${trip.departure}</option>
        </c:forEach>
    </select>
    <select name="arrival" id="arrival">
        <c:forEach items="${tripList}" var="trip">
            <option value="${trip.arrival}">${trip.arrival}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Search">
</form:form>
<a href="<c:url value='/j_spring_security_logout'/>"/>Выход</a>
</body>
</html>
