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
    <form action="/aispringmvc1_war_exploded/rest/map" method="post">
        用户1编号:<input type="text" name="map['a'].id"/><br>
        用户1姓名:<input type="text" name="map['a'].name"/><br>
        用户2编号:<input type="text" name="map['b'].id"/><br>
        用户2姓名:<input type="text" name="map['b'].name"/><br>
        用户3编号:<input type="text" name="map['c'].id"/><br>
        用户3姓名:<input type="text" name="map['c'].name"/><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
