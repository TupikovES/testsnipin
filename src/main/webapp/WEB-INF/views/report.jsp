<%@include file="header.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>

<h1>Отчет</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Год</th>
        <th scope="col">Факультет</th>
        <th scope="col">Колльчество</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${reportList}" var="rep">
        <tr>
            <th scope="row">${rep[0]}</th>
            <td>${rep[1]}</td>
            <td>${rep[2]}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>