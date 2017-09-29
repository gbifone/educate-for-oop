<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, com.luv2code.jsp.forEach.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Data</title>
</head>
    <%
        List<Student> data = new ArrayList<>();

        data.add(new Student("Kinza", "Fatima", true));
        data.add(new Student("Nadia", "Gull", true));
        data.add(new Student("Madiha", "Afzal", false));

        pageContext.setAttribute("myStudent", data);
    %>
<body>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Gold Customer </th>
        </tr>
        <c:forEach var="tempStudent" items="${myStudent}">
            <tr>
                <td> ${tempStudent.firstName} </td>
                <td> ${tempStudent.lastName} </td>
                <td>
                    <c:if test="${tempStudent.goldCustomer}">
                        Special Discount
                    </c:if>
                    <c:if test="${not tempStudent.goldCustomer}">
                        -
                    </c:if>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
