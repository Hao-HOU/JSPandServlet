<%@ page import="java.util.List" %><%--
  User: Hao HOU
  Date: 2017/7/26
  Time: 10:22
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Gossip 微博</title>
</head>
<body>
<%
    List<String> errors = (List<String>) request.getAttribute("errors");
    if (errors != null) {
%>
<h1>新增会员失败</h1>
<ul style="color: rgb(255, 0, 0);">
    <%
        for (String error : errors) {
    %>
    <li><%= error %>
    </li>
    <%
        }
    %>
</ul>
<br/>
<%
    }
%>
<h1>会员注册</h1>
<form method="post" action="register.do">
    <table bgcolor="#cccccc">
        <tr>
            <td>邮件地址：</td>
            <td><input type="text" name="email" value="${ param.email }" size="25" maxlength="100"/></td>
        </tr>
        <tr>
            <td>名称（最大16字符）：</td>
            <td><input type="text" name="username" value="${ param.username }" size="25" maxlength="16"></td>
        </tr>
        <tr>
            <td>密码（6到16字符）：</td>
            <td><input type="password" name="password" size="25" maxlength="16"></td>
        </tr>
        <tr>
            <td>确认密码：</td>
            <td><input type="password" name="confirmedPassword" size="25" maxlength="16"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
