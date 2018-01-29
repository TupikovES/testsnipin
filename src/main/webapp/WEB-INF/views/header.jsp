<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap" />
    <spring:url value="/resources/css/bootstrap-grid.css" var="bootstrap-grid" />
    <spring:url value="/resources/css/bootstrap-reboot.css" var="bootstrap-reboot" />
    <spring:url value="/resources/js/jquery-3.3.1.js" var="jquery" />
    <spring:url value="/resources/js/popper.js" var="popper" />
    <spring:url value="/resources/js/bootstrap.js" var="bootstrap-js" />
    <link href="${bootstrap}" rel="stylesheet" />
    <link href="${bootstrap-grid}" rel="stylesheet" />
    <link href="${bootstrap-reboot}" rel="stylesheet" />
</head>
<body>
    <div class="container">
