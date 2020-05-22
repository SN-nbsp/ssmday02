<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#addBtn").click(function () {
                location = "${pageContext.request.contextPath}/account/addAccountUI";
            });
            $("#delBtn").click(function () {
                //判断是否选中
                var selectedCheckboxLength = $("#f1 input[type='checkbox']:checked").length;
                //没有选中：提示
                if(selectedCheckboxLength<1){
                    alert("请先选中要删除的记录");
                    return;
                }
                //选中了：二次提示
                var sure = confirm("确定要删除所选记录吗?");
                //确定了：提交表单
                if(sure)
                    $("#f1").submit();
            });
        })
    </script>
</head>
<body>
<input type="button" id="addBtn" value="添加账户"/>
<input type="button" id="delBtn" value="删除账户"/>
<h2>账户列表</h2>
<form id="f1" method="post" action="${pageContext.request.contextPath}/account/delAccount">
    <table border="1" width="600px">
        <thead>
            <tr>
                <th>选择</th>
                <th>序号</th>
                <th>账号</th>
                <th>余额</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${accounts}" varStatus="vs" var="account">
            <tr style="background-color: ${vs.index%2==0?'#c3f3c3':'#f3c3f3'}">
                <td>
                    <input type="checkbox" name="aids" value="${account.aid}"/>
                </td>
                <td>${vs.count}</td>
                <td>${account.number}</td>
                <td>${account.balance}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/account/editAccountUI?aid=${account.aid}">修改</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>
