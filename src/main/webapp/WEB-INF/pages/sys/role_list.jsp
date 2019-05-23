<%--
  Created by IntelliJ IDEA.
  User: CGB
  Date: 2019/3/9
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <table border="1" cellpadding="1" cellspacing="1">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>note</th>
        </tr>
        </thead>
        <tbody id="tabBodyId">
        </tbody>
    </table>
    <script type="text/javascript">
        $(function(){
           // doGetObjects();
            doGetobjects02();
        });
        function doGetObjects(){
            //jquery提供的ajax函数
            $.ajax({
                url:"doFindPageObjects.do",
                dataType:"json",//期望的返回的数据格式
                data:{"pageCurrent":1},//提交的数据pageCurrent=1
                success:function(result) {//服务端响应OK后回调次函数
                    doSetTableTBody(result)//用于接受服务端返回的数据
                }
                error:function (result) {
                    console.log(result)
                },
                cache:false //不缓存数据
            });
        }
        /*
        借助jQuery的getJSON函数发起异步GET请求
         */
        function doGetobjects02() {
            var url="doFindPageObjects.do";
            var data={"pageCurrent":1};
            $.getJSON(url,data,function (result) {
                doSetTableTBody(result)
            });
        }
        /*
         借助jQuery的post函数发起异步post请求
         底层:
         1.创建Ajax请求对象(例如XmlHttpRequest)
         2.设置状态监听(监听服务端数据的返回)
         3.借助request对象的send方法发送Post请求(需要设置请求头)
         */
        function doGetobjects03() {
            var url="doFindPageObjects.do";
            var data={"pageCurrent":1};
            $.post(url,data,function (result) {
                doSetTableTBody(result)
            });//表单数据提交时一般建议使用post
        }
        function doSetTableTBody(data) {
            console.log(data)
        }
    </script>

