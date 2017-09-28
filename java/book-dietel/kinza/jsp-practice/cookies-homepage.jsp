<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
    <h3>Training Portal</h3>

    <%
        String favLang = "PHP";

        Cookie[] theCookies = request.getCookies();

        if( theCookies != null ){
            for( Cookie tempCookie : theCookies ){
                if( "myApp.favoriteLanguage".equals(tempCookie.getName()) ){
                    favLang = tempCookie.getValue();
                    break;
                }
            }
        }
    %>

    <h4>New Books for <%= favLang %></h4>

    <ul>
        <li>blah blah blah</li>
        <li>blah blah blah</li>
    </ul>

    <h4>Latest News Reports for <%= favLang %></h4>

    <ul>
        <li>blah blah blah</li>
        <li>blah blah blah</li>
    </ul>

    <h4>Hot jobs for <%= favLang %></h4>

    <ul>
        <li>blah blah blah</li>
        <li>blah blah blah</li>
    </ul>

<hr>
<a href="cookies-personalize-form.html">Personalize this page.</a>

</body>
</html>
