<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/11
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <div align="center">
        <table>
            <thead>
                <tr>
                    <th>商品编号</th>
                    <th>商品名称</th>
                    <th>商品价格</th>
                    <th>商品数量</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${list}">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.amount}</td>
                    <td>
                        <a href="/toEditProduct?id=${product.id}&name=${product.name}&price=${product.price}&amount=${product.amount}">修改</a>
                        <a href="deleteProduct?id=${product.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div align="center">
        <a href="toAddProduct">新增</a>
    </div>

</body>
</html>
