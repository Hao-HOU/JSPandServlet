<%@ page import="com.acehouhao.model.UserService" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Locale" %>
<%--
  User: Hao HOU
  Date: 2017/7/25
  Time: 21:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
    String username = (String) request.getSession().getAttribute("login");
%>
<html>
<head>
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="css/member.css" type="text/css" />
</head>
<body>
<div class="leftPanel">
    <img src="images/caterpillar.jpg" alt="Gossip 微博" />
    <br/><br/>
    <a href="logout.do?username=<%= username %>">注销 <%= username %></a>
</div>
<form method="post" action="message.do">
    分享新鲜事...<br/>
    <%
        String blabla = request.getParameter("blabla");
        if (blabla == null) {
            blabla = "";
        } else {
    %>
    信息要在 140 字以内<br/>
    <%
        }
    %>
    <textarea cols="60" rows="4" name="blabla"><%= blabla %></textarea><br/>
    <button type="submit">发布</button>
</form>
<table style="text-align: left; width: 510px; height: 88px;" border="0" cellpadding="2" cellspacing="2">
    <thead>
    <tr><th><hr/></th></tr>
    </thead>
    <tbody>
    <%
        UserService userService = (UserService) getServletConfig().getServletContext().getAttribute("userService");
        Map<Date, String> messages = userService.readMessage(username);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
        for (Date date : messages.keySet()) {
    %>
    <tr>
        <td style="vertical-align: top;">
            <%= username %><br/>
            <%= messages.get(date) %><br/>
            <%= dateFormat.format(date) %>
            <a href="delete.do?message=<%= date.getTime()%>">删除</a>
            <hr/>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
<hr style="width: 100%; height: 1px;"/>
</body>
</html>
