<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Специальности</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Факультет</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${departments}" var="dep">
        <tr>
            <th scope="row">${dep.id}</th>
            <td>${dep.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>
