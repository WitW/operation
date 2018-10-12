<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/11
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商品</title>
</head>
<body>
    <div align="center">
        <form method="post" action="/addProduct">
            名称:<input type="text" name="name"><br>
            价格:<input type="text" name="price"><br>
            数量:<input type="text" name="amount"><br>
            <input type="submit" value="增加">
        </form>
    </div>
</body>
</html>
