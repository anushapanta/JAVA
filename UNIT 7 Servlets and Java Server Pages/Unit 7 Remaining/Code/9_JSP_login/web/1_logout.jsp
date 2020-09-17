<%-- 
    Document   : 1_logout
    Created on : 28-Jun-2020, 08:34:09
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login System</title>
    </head>
    <body>
        <% session.invalidate();%> <!-- HERE WE ARE INVALIDATE THE SESSION, SO THAT NO VALUES WILL BE PRESENT IN SESSION -->
        <jsp:forward page="1_loginform.jsp"/>

    </body>
</html>
