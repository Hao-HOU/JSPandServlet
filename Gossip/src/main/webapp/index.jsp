<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gossip 微网志</title>
    <link rel="stylesheet" href="css/index.css" type="text/css">
</head>
<body>
<div id="leftPanel">
    <img src="images/caterpillar.jpg" alt="Gossip 微网志"/>
</div>
<div>
    <h1>Goosip ... XD</h1>
    <ul>
        <li>谈天说地不奇怪</li>
        <li>分享信息也可以</li>
        <li>随意写写表心情</li>
    </ul>
</div>
<div>
<a href="register.jsp">还不是会员？</a>
    <div style="color: rgb(255, 0, 0);">${ requestScope.clear() }</div>
<form action="login.do" method="post">
    <table bgcolor="#cccccc">
        <tr>
            <td colspan="2">会员登录</td>
        </tr>
        <tr>
            <td>名称：</td>
            <td><input type="text" name="username" value="${ param.username }"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="登录"></td>
        </tr>
        <tr>
            <td colspan="2"><a href="forgot.html">忘记密码？</a> </td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
