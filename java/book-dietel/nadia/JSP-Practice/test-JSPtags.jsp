<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        //core tag is use to handle variable ,looping and conditionals
    <c:set var = "stuff" value = "<%= new java.util.Date() %>" />

    Time on the server is ${stuff};

</body>
</html>
