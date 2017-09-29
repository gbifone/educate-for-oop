<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
    <%
        String[] cities = {"Mumbi","Singapore","Philadelphia"};

        pageContext.setAttribute("myCities",cities);
    %>
<body>
    <c:forEach var="tempCitie" items="${myCities}">
        ${tempCitie} <br/>
    </c:forEach>
</body>
</html>
