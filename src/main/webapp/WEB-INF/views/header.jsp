<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Title</title>
    <spring:url value="/resources/css/bootstrap.css" var="bs" />
    <spring:url value="/resources/css/bootstrap-grid.css" var="bootstrapgrid" />
    <spring:url value="/resources/css/bootstrap-reboot.css" var="bootstrapreboot" />
    <link href="${bs}" rel="stylesheet" />
    <link href="${bootstrapgrid}" rel="stylesheet" />
    <link href="${bootstrapreboot}" rel="stylesheet" />
</head>
<body>
    <div class="container-fluid">
        <%--Content--%>
        <div class="container">
            <ul class="nav">
                <li class="nav-item">
                    <a href="/snipin">Главная</a>
                </li>
                <li class="nav-item">
                    <a href="/snipin/students">Студенты</a>
                </li>
                <li class="nav-item">
                    <a href="/snipin/specialities">Специяльности</a>
                </li>
                <li class="nav-item">
                    <a href="/snipin/departments">Факультеты</a>
                </li>
            </ul>
