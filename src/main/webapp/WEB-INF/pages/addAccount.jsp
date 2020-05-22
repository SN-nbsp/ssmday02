<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户</title>
</head>
<body>
<h2>添加账户</h2>
<form method="post" action="${pageContext.request.contextPath}/account/addAccount">
    账号：<input type="text" name="number" value=""/><br/>
    余额：<input type="text" name="balance" value=""/><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
