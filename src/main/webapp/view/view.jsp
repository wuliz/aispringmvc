<%--
  Created by IntelliJ IDEA.
  User: bin_beyond
  Date: 2020-1-8
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--JSP表达式不会当做字符串处理--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${requestScope.user}====${user}
</body>
</html>
