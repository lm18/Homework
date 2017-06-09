<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15.04.2017
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New/Edit contact</title>
</head>
<body>
<h2>New/Edit contact</h2>
<form:form action="/saveOrUpdateTrip" method="post" modelAttribute="tripEntity">
    <table>
        <tr>
            <form:hidden path="tripId"/>
            <td>Number:</td>
            <td><form:input path="tripNumber"/></td>
        </tr>
        <tr>
            <td>Type:</td>
            <td><form:input path="type"/></td>
        </tr>
        <tr>
            <td>Departure:</td>
            <td><form:input path="departure"/></td>
        </tr>
        <tr>
            <td>Arrival:</td>
            <td><form:input path="arrival"/></td>
        </tr>
        <tr>
            <td>Country:</td>
            <td><form:input path="countryByCountry"/></td>
        </tr>
    </table>
    <input type="submit" value="Save">
</form:form>
</body>
</html>