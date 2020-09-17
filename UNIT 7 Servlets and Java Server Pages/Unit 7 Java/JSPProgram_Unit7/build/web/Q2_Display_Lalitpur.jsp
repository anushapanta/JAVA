<%-- 
    Document   : Q2_Display_Lalitpur
    Created on : 25-Jun-2020, 12:43:53
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Program</title>
</head>
<body>
    <h1>Displaying Lalitpur,Nepal 10 Times</h1><hr>
    <%
        for (int i = 1; i <= 10; i++) {
            out.println("Lalitpur,Nepal <br>");
        }
    %>
</body>
</html>
