<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <spring:url value="/resources/css/bootstrap.css" var="bs" />
    <spring:url value="/resources/css/bootstrap-grid.css" var="bootstrapgrid" />
    <spring:url value="/resources/css/bootstrap-reboot.css" var="bootstrapreboot" />
    <link href="${bs}" rel="stylesheet" />
    <link href="${bootstrapgrid}" rel="stylesheet" />
    <link href="${bootstrapreboot}" rel="stylesheet" />
</head>
<body>
    <div class="container">
