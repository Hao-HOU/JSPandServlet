<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 14:56
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>在线书签</title>
</head>
<body>
<c:import url="bookmarks.xml" var="xml" charEncoding="UTF-8"/>
<x:parse var="bookmarks" doc="${ xml }"/>
<h2>在线书签</h2>
<table border="1">
    <tr bgcolor="#00ff00">
        <th align="left">名称</th>
        <th align="left">网址</th>
        <th align="left">分类</th>
    </tr>
    <x:forEach select="$bookmarks//bookmark" var="bookmark">
        <tr>
            <td><x:out select="$bookmark/title"/></td>
            <td><x:out select="$bookmark/url"/></td>
            <td><x:out select="$bookmark/category"/></td>
        </tr>
    </x:forEach>
</table>
</body>
</html>
