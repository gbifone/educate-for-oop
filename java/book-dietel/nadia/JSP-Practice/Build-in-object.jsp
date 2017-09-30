<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Build-in-Objects</title>
</head>
<body>

    <h3> JSP Build-in-Objects </h3>

Request user Agent: <%= request.getHeader("User-Agent") %>

    </br></br>

Request language: <%= request.getLocale() %>

</body>
</html>
