<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:set var="stuff" value="<%= new java.util.Date()%>" />

    Time of the server is: ${stuff}
</body>
</html>
