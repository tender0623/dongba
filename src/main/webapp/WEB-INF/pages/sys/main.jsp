<%--
  Created by IntelliJ IDEA.
  User: CGB
  Date: 2019/3/6
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript " src="/llibs/jquery-1.4.2.js"></script>
</head>
<body>
    <h1>MAIN</h1>
    <button id="load-role-id">角色管理</button>
    <%--内容太呈现区--%>
    <div id="content">
    </div>
<script type="text/javascript">
    $(function()
    {
//        console.log("page load ok")
        $("#load-role-id").click(function(){
            //异步加载,底层会启动AJAX请求
           $("#content").load("listUI.do") ;
        });
    });
</script>
</body>
</html>
