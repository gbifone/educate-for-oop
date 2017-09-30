<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> ToDo List </title>
</head>
<body>
   <form action="todo-demo.jsp">
       Add new Item: <input type="text" name="theItem" />
                     <input type="submit" value="Submit" />
   </form>

<%
    List<String> items = (List<String>) session.getAttribute("myToDoList");
    if(items == null){
        items = new ArrayList<>();
        session.setAttribute("myToDoList" ,items);
    }
    String theItem = request.getParameter("theItem");
    if ( (theItem != null) && (!theItem.trim().equals("")) ) {
        items.add(theItem);
    }
%>

<hr>
   <b>TO List Item: </b>
   <ol>
       <%
           for (String temp : items){
               out.println("<li>" + temp + "</li>");
           }
       %>

    </ol>
</body>
</html>
