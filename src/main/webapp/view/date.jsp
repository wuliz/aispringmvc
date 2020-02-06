<%--
  Created by IntelliJ IDEA.
  User: bin_beyond
  Date: 2020-1-8
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=path%>/converter/date" method="post">
    请输⼊⽇期:
    <input type="text" name="date"/>(yyyy-MM-dd)<br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
