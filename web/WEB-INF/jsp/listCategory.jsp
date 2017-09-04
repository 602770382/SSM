<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lawrie
  Date: 2017/9/4
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="UTF-8" import="java.util.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="text-align:center;width:300px;margin:10px auto;border:1px solid black">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td><a href="editCategory?id=${c.id}&name=${c.name}">edit</a></td>
            <td><a href="deleteCategory?id=${c.id}">delete</a></td>
        </tr>
    </c:forEach>

</table>
<div style="width:200px;margin:0 auto">
    <a href="?start=0">首页</a>
    <a href="?start=${page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count}">下一页</a>
    <a href="?start=${page.last}">尾页</a>
</div>
<div style="width:200px;margin:10px auto;">
    <form action="addCategory" method="post">
        <input type="text" name="name"/>
        <input type="submit" value="submit"/>
    </form>
</div>
</body>
</html>
