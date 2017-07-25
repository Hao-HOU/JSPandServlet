<%--
  User: Hao HOU
  Date: 2017/7/25
  Time: 21:03
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="util" uri="http://acehouhao.com/util" %>
<html>
<head>
    <title>自定义 EL 函数</title>
</head>
<body>
${param.string}
<br/>
${ util:length(param.string) }
</body>
</html>
