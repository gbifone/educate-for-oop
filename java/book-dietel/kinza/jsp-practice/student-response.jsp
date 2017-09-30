<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation Title</title>
</head>
<body>
    The Student is confirmed: ${param.firstName} ${param.lastName}
        <br/><br/>
    This student's country: ${param.country}
        <br/><br/>
    The student's favorite Language: ${param.favoriteLanguage}
        <br/><br/>
    The student's favorite Games:
    <ul>
        <%

            String[] langs = request.getParameterValues("favoriteGames");

            if (langs != null) {
                for (String temp : langs) {
                    out.println("<li>" + temp + "</li>");
                }
            }
        %>
    </ul>
        <br/><br/>

</body>
</html>
