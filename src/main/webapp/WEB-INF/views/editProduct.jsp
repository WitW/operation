<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/11
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品</title>
</head>
<body>
    <div align="center">
        <form action="/editProduct" method="post">
            名称：<input type="text" value="${product.name}" name="name"><<br>
            价格：<input type="text" value="${product.price}" name="price"><br>
            数量：<input type="text" value="${product.amount}" name="amount"><br>
                 <input type="hidden" value="${product.id}" name="id">
            <input type="submit" value="修改">
        </form>
    </div>
</body>
</html>
