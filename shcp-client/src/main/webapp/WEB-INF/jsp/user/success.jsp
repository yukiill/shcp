<%--
  Created by IntelliJ IDEA.
  User: Yuki
  Date: 2019/3/26
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    var form = document.getElementById("form");
    form.submit();
</script>
<body>
    <h1>请认证邮箱后再进行登录</h1>
    <button onclick="submit" type="button">点击发送验证邮件</button>

    <form id="form" action="/email/send" method="post">
        <input type="hidden" name="time" value="${time}">
        <input type="hidden" name="userId" value="123">
        <input type="hidden" name="eCode" value="1005">
    </form>
</body>
</html>
