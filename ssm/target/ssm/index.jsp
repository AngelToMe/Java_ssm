<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h3>首页</h3>

    <a href="account/findAll">测试findAll方法</a>

    <h3>测试包</h3>

    <form action="account/save" method="post">
        姓名: <input type="text" name="name">
        金额: <input type="text" name="money">
        <input type="submit" value="保存">
    </form>

</body>
</html>
