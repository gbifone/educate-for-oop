<%--
  Created by IntelliJ IDEA.
  User: Nadia
  Date: 9/25/2017
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Converting a String to Uppercase: <%= new String("Hello World").toUpperCase()%>

<br/><br/>

    25 multiplied by 4 equals! <%= 25*4 %>

<br/><br/>

    Is 75 less than 69? <%= 75 < 69 %>

<br/><br/>
    <%
        for(int i=1; i<=5; i++){
            out.println("<br/> I really luv2Code:" +i);
        }
    %>

</body>
</html>
