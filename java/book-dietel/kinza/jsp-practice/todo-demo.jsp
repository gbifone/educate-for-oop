<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>

    <!-- Step 1: Create HTML Form -->
    <form action="todo-demo.jsp">
        Add new Item: <input type="text" name="theItem" />
        <input type="submit" name="submit" />
    </form>

    <!-- Step 2: Add new items to "TO DO" List -->
        <%
            //get To DO items form session
            List<String> items = (List<String>) session.getAttribute("myToDoList");

            // if To Do item doesn't exist, then create a new one
            if( items == null ){
                items = new ArrayList<>();
                session.setAttribute("myToDoList", items);
            }

            // see if there is form data to add
            String theItem = request.getParameter("theItem");
            if( (theItem != null) && (!theItem.trim().equals("")) ){
                items.add( theItem );
            }
        %>
        <!-- Step 3: Display all "TO DO" items from session -->
        <hr />
        <b>To List items:</b>
        <br/>

        <ol>
            <%
                for(String temp: items){
                    out.println( "<li>" + temp + "</li>" );
                }
            %>
        </ol>

</body>
</html>
