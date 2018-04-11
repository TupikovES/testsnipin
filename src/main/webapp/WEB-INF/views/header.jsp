<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>${title}</title>
    <spring:url value="/resources/css/bootstrap.css" var="bs" />
    <spring:url value="/resources/css/bootstrap-grid.css" var="bootstrapgrid" />
    <spring:url value="/resources/css/bootstrap-reboot.css" var="bootstrapreboot" />
    <c:set var="rc" value="<%=request.getContextPath()%>" />
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
                    <a class="nav-link" href="${rc}">Главная</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${rc}/students">Студенты</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${rc}/specialities">Специяльности</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${rc}/departments">Факультеты</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${rc}/report">Отчет</a>
                </li>
            </ul>
