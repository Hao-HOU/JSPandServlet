<%@ page import="java.text.DateFormat" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.List" %>
<%@ page import="com.acehouhao.model.Blah" %>
<%--
  User: Hao HOU
  Date: 2017/7/25
  Time: 21:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="css/member.css" type="text/css"/>
</head>
<body>
<div class="leftPanel">
    <img src="images/caterpillar.jpg" alt="Gossip 微博"/>
    <br/><br/>
    <a href="logout.do?username=${ sessionScope.login }">注销 ${ sessionScope.login }</a>
</div>
<form method="post" action="message.do">
    分享新鲜事...<br/>
    <%
        String blabla = (String) request.getAttribute("blabla");
        if (blabla != null) {
    %>
    信息要在 140 字以内<br/>
    <%
        }
    %>
    <textarea cols="60" rows="4" name="blabla">${ requestScope.blabla }</textarea><br/>
    <button type="submit">发布</button>
</form>
<table style="text-align: left; width: 510px; height: 88px;" border="0" cellpadding="2" cellspacing="2">
    <thead>
    <tr>
        <th>
            <hr/>
        </th>
    </tr>
    </thead>
    <tbody>
    <%
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
        List<Blah> blahs = (List<Blah>) request.getAttribute("blahs");
        for (Blah blah : blahs) {
    %>
    <tr>
        <td style="vertical-align: top;">
            <%= blah.getUsername() %><br/>
            <%= blah.getTxt() %><br/>
            <%= dateFormat.format(blah.getDate()) %>
            <a href="delete.do?message=<%= blah.getDate().getTime() %>">删除</a>
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
