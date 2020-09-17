<%-- 
    Document   : Q5_Student_Display
    Created on : 25-Jun-2020, 19:07:31
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Record</title>
    </head>
    <body>
        <h1>Student details of : <%=request.getParameter("full_name")%></h1>
        <p>
            Full Name:<%=request.getParameter("full_name")%><br>
            Address:<%=request.getParameter("address")%><br>
            Age:<%=request.getParameter("age")%><br>
            College:<%=request.getParameter("college_name")%><br>
            Phone:<%=request.getParameter("phone")%>         
        </p>
    </body>
</html>
