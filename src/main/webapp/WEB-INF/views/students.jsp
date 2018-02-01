<%@include file="header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<h1>Студенты</h1>

<table class="table table-hover">
    <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Фамилия</th>
            <th scope="col">Имя</th>
            <th scope="col">Отчество</th>
            <th scope="col">Телефон</th>
            <th scope="col">Адрес</th>
            <th scope="col">Год поступления</th>
            <th scope="col">Специальность</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${students}" var="student">
            <tr>
                <th scope="row">${student.id}</th>
                <td>${student.lastName}</td>
                <td>${student.firstName}</td>
                <td>${student.middleName}</td>
                <td>${student.phone}</td>
                <td>${student.address}</td>
                <td>${student.year}</td>
                <td>${student.speciality.name}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<%@include file="footer.jsp"%>
