<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>JSP Built-in</h3>

Request User agent: <%= request.getHeader("User-Agent") %>

<br/><br/>

Request Language : <%= request.getLocale() %>

</body>
</html>
