<%--
  Created by IntelliJ IDEA.
  User: vtorres
  Date: 29/06/15
  Time: 01:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/style.css'/>">
</head>
<body>
  <h1>Register</h1>
  <form method="POST">
    First Name: <input type="text" name="firstName"/>
    Last Name : <input type="text" name="lastName"/>
    Username  : <input type="text" name="username"/>
    Password  : <input type="password" name="password"/>
    <input type="submit" value="Register">
  </form>
</body>
</html>
