<%--
  Created by IntelliJ IDEA.
  User: Lawrie
  Date: 2017/9/5
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
            width:300px;
            margin:0 auto;
            border:1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="updateProduct" method="post">
    name:<input type="text" name="name" value="${product.name}"/><br/>
    price:<input type="text" name="price" value="${product.price}"/>
    <input type="hidden" name="id" value="${product.id}"/>
    <input type="hidden" name="category.id" value="${product.category.id}"/>
    <input type="submit" name="submit"/>
</form>
</body>
</html>
