<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    Converting a string to uppercase: <%= new String("Hello World").toUpperCase() %>

    <br/><br/>

    25 multiplied by 4 equals <%= 25*4 %>

    <br/><br/>

is 75 less then 69? <%= 75 < 69 %>

    <br/><br/>

    <%
        for(int i=1; i<=5; i++){
            out.println("<br/>Hello World to java!: "+ i);
        }
    %>

    <br/><br/>

    <%!
        String makeItLower(String data){
            return data.toLowerCase();
        }
    %>

Lower Case "Hello World" : <%= makeItLower("Hello World")%>

</body>
</html>
