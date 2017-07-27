<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 15:16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>在线书签</title>
</head>
<body>
<c:import url="bookmarks.xml" var="xml" charEncoding="UTF-8"/>
<c:import url="${ param.xslt }" var="xslt" charEncoding="UTF-8"/>
<x:transform doc="${ xml }" xslt="${ xslt }">
    <x:param name="headline" value="在线书签"/>
</x:transform>
</body>
</html>
