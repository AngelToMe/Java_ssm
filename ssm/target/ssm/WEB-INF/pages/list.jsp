<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h1>findAll查询所有账户成功！</h1>
    <c:forEach items="${list}" var="account">
        ${account}<br>
    </c:forEach>
</body>
</html>
