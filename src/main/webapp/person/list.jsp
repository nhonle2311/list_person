<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-3">
        <table class="table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Date</th>
                <th>Address</th>
                <th>Img</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${personList}" var="person">
            <tr>

                <td>${person.name}</td>
                <td>${person.date}</td>
                <td>${person.address}</td>
                <td>${person.img}</td>
            </tr>
            </c:forEach>
            <tr>
                <td scope="row"></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table> 
    </div>
</body>
</html>
