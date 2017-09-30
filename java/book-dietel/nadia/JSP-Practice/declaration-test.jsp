<%--
  Created by IntelliJ IDEA.
  User: Nadia
  Date: 9/25/2017
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration-Test</title>
</head>
<body>
    <%!
        String makeItLower(String str){
            return str.toLowerCase();
        }
    %>

    Lower Case "Hello World!": <%= makeItLower("Hello World") %>

</body>
</html>
