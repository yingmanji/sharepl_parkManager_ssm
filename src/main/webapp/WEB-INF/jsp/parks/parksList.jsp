<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 樱满集0_0
  Date: 2017/9/10
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>停车场管理员系统</title>
</head>
<body>
    <form>
        <table border="1" width="100%">
            停车场管理员数据:
            <tr>
                <td>租车者姓名</td>
                <td>租车者手机号</td>
                <td>所租车位地址</td>
                <td>所属停车场id</td>
                <td>车位所有者姓名</td>
                <td>车位所有者手机号</td>
            </tr>

            <c:forEach items="${ParkinglotCustoms}" var="park">
                <tr>

                    <td>${park.user_name}</td>
                    <td>${park.phone_num}</td>
                    <td>${park.parkLocation}</td>
                    <td>${park.parkingId}</td>
                    <td>${park.ordersUserName}</td>
                    <td>${park.ordersPhoneNum}</td>

                </tr>
            </c:forEach>

        </table>
    </form>
</body>
</html>
