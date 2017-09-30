<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Confirmation </title>
</head>

    <%
        //Read the Form data
        String favLang = request.getParameter("favoriteLanguage");

        //create cookies
        Cookie theCookie = new Cookie("myApp.favoriteLanguage" ,favLang);

        //set the life Span... total number of seconds
        theCookie.setMaxAge(60*60*24*365);      // <-- for oone year

        //send cookies to the browser
        response.addCookie(theCookie);
    %>
<body>

    Thanks! We set your favorite Language to: ${param.favoriteLanguage}

    <br/><br/>

    <a href="cookies-homepage.jsp"> Return to HomePage </a>

</body>
</html>
