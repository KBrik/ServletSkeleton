<%--
  Created by IntelliJ IDEA.
  User: katya
  Date: 16.02.2018
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<br>
<br>
<h2>Your reversed text is:</h2>
<h3><%= session.getAttribute("reversedText") %>></h3>
<a href="/index.jsp">Back to landing page</a>
</body>
</html>
