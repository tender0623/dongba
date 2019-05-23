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
    <script type="text/javascript">
        <%--获取AJAX--%>
        function getRequestObject(){
            if(window.XMLHttpRequest){
                return(new XMLHttpRequest());
            }else if(window.ActiveXObject){
                return(new ActiveXObject("Microsoft.XMLHTTP"))
            }else{
                return(null)
            }
        }
        function doFindPageObjects() {
           //1.获取ajax请求对象
            var request=getRequestObject();
            //2.发送请求
            //2.1设置响应处理函数
            request.onreadystatechange=function(){
                //3.处理响应,异步刷新
                handlerResponse(request)
            }
            //2.2初始化请求参数
            request.open("GET","doFindPageObjects.do")
            //2.3发送异步请求
            request.send(null);
        }
        /**
         * 处理ajax响应
         * @param request
         */
        function handleResponse(request){
            if (request.readyState==4&&request,status==200){
                var div=document.getElementById("contain");
                div.innerHTML=request.responseText;
            }
        }
    </script>
</head>
<body>
    <h1>ROLES</h1>
    <button onclick="doFindPageObjects()" value="doQuery"> ganta</button>
    <%--将服务端返回的数据呈现在此位置--%>
    <div id="contain"/>
</body>
</html>
