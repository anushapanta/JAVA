<%-- 
    Document   : Q1_Display_Ktm
    Created on : 25-Jun-2020, 12:36:57
    Author     : anusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Program</title>
    </head>
    <body>
        <h1>Displaying Kathmandu,Nepal 10 Times</h1><hr>
        <%
            for (int i = 1; i <= 10; i++) {
                out.println("Kathmandu,Nepal <br>");
            }
        %>
    </body>
</html>
