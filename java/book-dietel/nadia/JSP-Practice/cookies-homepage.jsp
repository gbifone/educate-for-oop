<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookies-homepage</title>
</head>
<body>
        <!-- Read the Favorite Programming Language Cookies -->
    <%
        //the default... if there is no cookies
        String favLang = "Java";

        //get cookies from the browser object
        Cookie[] theCookies = request.getCookies();

        //find over favorite Language Cookies
        if(theCookies != null){
            for (Cookie tempCookies : theCookies){
                if("myApp.favoriteLanguage".equals(tempCookies.getName())){
                    favLang = tempCookies.getValue();
                    break;
                }
            }
        }
    %>
    <!-- Show new books for this language -->
        <h4>Nwe Book For <%= favLang %></h4>
        <ul>
            <li>dfghj cvbn xbn</li>
            <li>dfghj cvbn xbn</li>
        </ul>
        <h4>Hot Jobs For <%= favLang %></h4>
        <ul>
            <li>dfghj cvbn xbn</li>
            <li>dfghj cvbn xbn</li>
        </ul>
        <h4>Latest News Report For <%= favLang %></h4>
        <ul>
            <li>dfghj cvbn xbn</li>
            <li>dfghj cvbn xbn</li>
        </ul>
    <hr>
    <a href="cookies-personalize-form.html">Personalise this page</a>

</body>
</html>
