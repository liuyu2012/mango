<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/6 0006
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="get" action="/user/login">
    用户名：<input type="text" name = "name"/><br/>
    密码：<input type="text" name="password"/>
    <input type="submit" value="登录"/>

</form>
</body>
</html>
