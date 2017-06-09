<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15.04.2017
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Рейсы</title>
</head>
<body>
<a href="/newTrip">New Trip</a>
<br/><br/>
<table border="1">
    <th>Number</th>
    <th>Type</th>
    <th>Departure</th>
    <th>Arrival</th>
    <th>Action</th>
    <c:forEach items="${triptList}" var="trip">
        <tr>
            <input type="hidden" value="${trip.tripId}"/>
            <td>${trip.tripNumber}</td>
            <td>${trip.type}</td>
            <td>${trip.departure}</td>
            <td>${trip.arrival}</td>
            <input type="hidden" value="${trip.countryByCountry}"/>
            <td>
                <a href="/deleteTrip/${trip.tripId}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value='/j_spring_security_logout'/>"/>Выход</a>
</body>
</html>