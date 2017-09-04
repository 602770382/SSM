<%--
  Created by IntelliJ IDEA.
  User: Lawrie
  Date: 2017/9/4
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updateCategory" method="post">
    name:<input type="text" name="name" value="${category.name}"/><br/>
    <input type="hidden" name="id" value="${category.id}"/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
