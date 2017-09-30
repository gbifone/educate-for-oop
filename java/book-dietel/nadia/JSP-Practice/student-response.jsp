<%--
  Created by IntelliJ IDEA.
  User: Nadia
  Date: 9/26/2017
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Student Confermation Title </title>
</head>
<body>

    Student is confermed:${param.firstName} ${param.lastName}
    <br/><br/>
    The Student's Country:${param.country}
    <br/><br/>
    The Student's programming Language:${param.favoriteLanguage}
    <br/><br/>
    Student Favorite Games: <br/>
        <ul>
            <%
                String[] games = request.getParameterValues("favoriteGame");
                if (games !=null) {
                    for (String favGames : games) {
                        out.println("<li>" + favGames + "</li>");
                    }
                }
            %>
        </ul>

</body>
</html>
