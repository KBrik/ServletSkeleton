<%--
  Created by IntelliJ IDEA.
  User: katya
  Date: 16.02.2018
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome page</title>
  </head>
  <body>
  <br>
  <br>
  <br>
  <form action="reverse" method="get">
  <input type="text" name="text" size="20" placeholder="input text">
  <input type="submit" value="GET RESPONSE">
  </form>
  <br>
  <br>
  <br>
  <form action="reverse" method="post">
  <input type="text" name="text" size="20" placeholder="input text">
  <input type="submit" value="POST RESPONSE"></form>
  <br>
  <br>
  <br>
  <form action="reverse" method="delete">
  <input type="text" name="text" size="20" placeholder="input text">
  <input type="submit" value="DELETE RESPONSE"></form>
  <br>
  <br>
  <br>
  <form action="reverse" method="put">
  <input type="text" name="text" size="20" placeholder="input text">
  <input type="submit" value="PUT RESPONSE"></form>
  </body>
</html>
