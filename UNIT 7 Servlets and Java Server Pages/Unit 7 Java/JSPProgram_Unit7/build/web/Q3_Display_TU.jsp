<%-- 
    Document   : Q3_Display_TU
    Created on : 25-Jun-2020, 12:46:38
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
    <h1>Displaying Tribhuvan University 10 Times</h1><hr>
    <%
        for (int i = 1; i <= 10; i++) {
            out.println("Tribhuvan University <br>");
        }
    %>
</body>
</html>
