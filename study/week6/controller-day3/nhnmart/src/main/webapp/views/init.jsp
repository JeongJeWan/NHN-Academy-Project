<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeongjewan
  Date: 2023/04/04
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Init</title>
  <style>
    table {
      border-collapse: collapse;
      width: 40%;
    }

    th, td {
      text-align: left;
      padding: 8px;
    }

    th {
      background-color: #4CAF50;
      color: white;
    }

    tr:nth-child(even) {
      background-color: #f2f2f2;
    }
  </style>
</head>
<%--<fmt:setLocale value="<%=locale%>"/>--%>
<fmt:bundle basename="message">
<body>
<h2><fmt:message key="foodReady"/></h2>

<table>
  <thead>
  <tr>
    <th><fmt:message key="foodName"/></th>
    <th><fmt:message key="foodPrice"/></th>
    <th><fmt:message key="foodQuantity"/></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${foods}" var="food">
    <tr>
      <td>${food.name}</td>
      <td>${food.price}</td>
      <td>${food.quantity}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<a href="${pageContext.request.contextPath}/foodList.do"><fmt:message key="foodList"/></a>
</body>
</fmt:bundle>
</html>
