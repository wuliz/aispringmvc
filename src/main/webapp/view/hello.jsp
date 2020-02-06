<%--
  Created by IntelliJ IDEA.
  User: bin_beyond
  Date: 2019-12-16
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/aispringmvc1_war_exploded/hello/save" method="post">
        用户id:<input type="text" name = 'id'>
        用户名:<input type="text" name="name">
        用户地址: <input type="text" name="address.value">
        <input type="submit" value="提交">
    </form>
</body>
</html>
