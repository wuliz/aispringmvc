<%--
  Created by IntelliJ IDEA.
  User: bin_beyond
  Date: 2019-12-27
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/aispringmvc1_war_exploded/rest/list" method="post">
        用户1编号:<input type="text" name="list[0].id"/><br>
        用户1姓名:<input type="text" name="list[0].name"/><br>
        用户2编号:<input type="text" name="list[1].id"/><br>
        用户2姓名:<input type="text" name="list[1].name"/><br>
        用户3编号:<input type="text" name="list[2].id"/><br>
        用户3姓名:<input type="text" name="list[2].name"/><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
