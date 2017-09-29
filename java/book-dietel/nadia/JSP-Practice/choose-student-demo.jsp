<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*,com.luv2code.jsp.foreach.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Foreach-Student-Demo</title>
</head>
        <%
            List<Student> data = new ArrayList<>();

            data.add(new Student("Kinza","Fatima",false));
            data.add(new Student("Maheeen","Fatima",false));
            data.add(new Student("Nadia","Gull",true));
            pageContext.setAttribute("myStudent",data);
        %>
<body>
    <table border="1">
        <tr>
            <th>FirstName</th>
            <th>LastName</th>
            <th>GoldCustomer</th>
        </tr>
        <c:forEach var="tempStudent" items="${myStudent}">
            <tr>
                <td> ${tempStudent.firstName} </td>
                <td> ${tempStudent.lastName} </td>
                <td>
                    <c:choose>
                      <c:when test="${tempStudent.goldCustomer}">
                          Special Discount
                      </c:when>
                      <c:otherwise >
                            No soup for you!
                      </c:otherwise>
                    </c:choose>
                </td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>
