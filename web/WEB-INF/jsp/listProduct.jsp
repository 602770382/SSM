<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lawrie
  Date: 2017/9/5
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
    <style>
        .s{
            width:300px;
            margin:0 auto;
            border:1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
<table class="s">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${ps}" var="p" varStatus="st">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td><a href="editProduct?id=${p.id}">edit</a></td>
            <td><a href="deleteProduct?id=${p.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<form class="s" action="addProduct" method="post">
    name:<input type="text" name="name"/><br/>
    price:<input type="text" name="price"/><br/>
    <input type="hidden" name="category.id" value="${category.id}"/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
