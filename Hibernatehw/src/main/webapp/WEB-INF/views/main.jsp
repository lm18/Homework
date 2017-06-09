
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25.04.2017
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/style.css" var="style"/>
    <spring:url value="/resources/css/font-awesome.min.css" var="font"/>
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapjs"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${style}" rel="stylesheet"/>
    <link href="${font}" rel="stylesheet"/>
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
                <li><a href="/login">Вход</a></li>
                <%--<li><a href="/logout">Выход</a></li>--%>
            </ul>
        </div>
    </div>
</div>
<div id="headerwrap">
    <div class="container">
        <div class="row centered">

        </div>
    </div>
</div>
<div class="container w">
    <div class="row centered">
        <br><br>
        <div class="col-lg-4">
            <i class="fa fa-globe fa-5x" aria-hidden="true"></i>
            <h4>О TrainTravel</h4>
            <p>TrainTravel — бесплатный сайт по поиску самостоятельных путешествий. Мы находим полную информацию о
                расписании поездов.</p>
        </div>
        <div class="col-lg-4">
            <i class="fa fa-info-circle fa-5x" aria-hidden="true"></i>
            <h4>Новости</h4>
            <p>Следите за новоcтями, узнавайте о спецпредложениях на нашем новостном портале</p>
        </div>
        <div class="col-lg-4">
            <i class="fa fa-mobile fa-5x" aria-hidden="true"></i>
            <h4>Приложения</h4>
            <p>Наши мобильные приложения моментально находят лучшие предложения. Попробуйте сами!</p>
        </div>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="${bootstrapjs}"></script>
</body>
</html>
