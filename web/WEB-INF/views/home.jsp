<%--
  Created by IntelliJ IDEA.
  User: vtorres
  Date: 28/06/15
  Time: 02:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/style.css' /> ">
  </head>
  <body>
  <h1>Welcome to Spittr</h1>
  <a href="<c:url value='/spittles' />">Spittles</a>
  <a href="<c:url value='/spitter/register' />">Register</a>
  </body>
</html>
