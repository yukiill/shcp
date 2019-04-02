<%--
  Created by IntelliJ IDEA.
  User: Yuki
  Date: 2019/3/31
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/login" method="post">
        <input type="text" name="userName">
        <input type="text" name="password">
        <input type="submit" value="submit">
    </form>
    <form action="/user/changeimg" method="post" enctype="multipart/form-data">
        <input type="file" name="file">
        <input type="submit" value="submit">
    </form>
</body>
</html>
