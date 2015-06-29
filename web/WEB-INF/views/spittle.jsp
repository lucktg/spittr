<%--
  Created by IntelliJ IDEA.
  User: vtorres
  Date: 29/06/15
  Time: 12:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spittle</title>
</head>
<body>
<h1>Spittle</h1>
  <div class="spittleView">
    <div class="spittleMessage"><c:out value="spittle.message"/></div>
    <div>
        <span class="spittleTime"><c:out value="spittle.time"/></span>
    </div>
  </div>
</body>
</html>
