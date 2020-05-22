<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请稍后</title>
    <!--
    设置响应消息头：
        http-equiv：指定响应消息头的名称。Refresh：刷新
        content:指定响应消息头的值。0：0秒后何时刷新
                            url：刷新到的目的地

      进行友好提示：
            目标资源（findAllAccounts）准备好了，立即执行，此页面一闪而过
            没有准备好，此页面友好提示
    -->
    <meta http-equiv="Refresh" content="0;URL=${pageContext.request.contextPath}/account/findAllAccounts">
</head>
<body>
请稍后，程序正在启动......
</body>
</html>
