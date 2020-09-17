<%-- 
    Document   : 1_admin
    Created on : 26-Jun-2020, 10:40:43
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <%
            String username = (String) session.getAttribute("user");
            
            if (username == null ) {
        %>
        <jsp:forward page="1_loginform.jsp"/>
        <%        } else {
            out.println("<h1>Welcome To Java Class," + username + "</h1>");

        %>
        <a href="1_logout.jsp">Logout</a>
        <%            }
        %>

    </body>
</html>



