<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>Специальности</h1>

<table class="table table-hover">
    <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Название специальности</th>
            <th scope="col">Факультет</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${specialities}" var="spec">
            <tr>
                <th scope="row">${spec.id}</th>
                <td>${spec.name}</td>
                <td>${spec.department.name}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>
