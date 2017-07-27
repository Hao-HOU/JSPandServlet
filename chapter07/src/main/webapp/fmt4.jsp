<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="javax.servlet.jsp.jstl.fmt.LocalizationContext" %>
<%--
  User: Hao HOU
  Date: 2017/7/27
  Time: 9:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
//    ResourceBundle zh_TW = ResourceBundle.getBundle("hello", new Locale("zh", "TW"));
//    ResourceBundle zh_CN = ResourceBundle.getBundle("hello", new Locale("zh", "CN"));
//    ResourceBundle ja_JP = ResourceBundle.getBundle("hello", new Locale("ja", "JP"));
//    ResourceBundle en_US = ResourceBundle.getBundle("hello", new Locale("en", "US"));
//
//    pageContext.setAttribute("zh_TW", new LocalizationContext(zh_TW));
//    pageContext.setAttribute("zh_CN", new LocalizationContext(zh_CN));
//    pageContext.setAttribute("ja_JP", new LocalizationContext(ja_JP));
//    pageContext.setAttribute("en_US", new LocalizationContext(en_US));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:message bundle="${ zh_TW }" key="cc.openhome.hello"/><br/>
<fmt:message bundle="${ zh_CN }" key="cc.openhome.hello"/><br/>
<fmt:message bundle="${ ja_JP }" key="cc.openhome.hello"/><br/>
<fmt:message bundle="${ en_US }" key="cc.openhome.hello"/><br/>
</body>
</html>
