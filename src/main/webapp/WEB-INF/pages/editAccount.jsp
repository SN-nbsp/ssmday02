<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改账户</title>
</head>
<body>
<h2>修改账户</h2>
<form method="post" action="${pageContext.request.contextPath}/account/editAccount">
    <input type="hidden" name="aid" value="${account.aid}">
    账号：<input type="text" name="number" value="${account.number}"/><br/>
    余额：<input type="text" name="balance" value="${account.balance}"/><br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
