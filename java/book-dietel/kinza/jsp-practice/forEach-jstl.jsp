<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>For Each Loop</title>
</head>
    <%
        String[] cities = {"Rahim Yar Khan", "Bahawalpur", "Lahore" };
        pageContext.setAttribute("myCities", cities);
    %>
<body>

    <c:forEach var="tempCity" items="${myCities}">
        ${tempCity} <br/>
    </c:forEach>

</body>
</html>
