<%-- 
    Document   : Q4_Illustrate_JSP
    Created on : 25-Jun-2020, 12:52:07
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Illustrate JSP</title>
    </head>
    <body>
        <h1>Welcome to Guessing Game!!!<hr></h1>     

        <form action="Q4_GuessResult.jsp" method="POST">
            Enter a  number between 1 and 100 :
            <input type="text" name="user_input">           
            <input type="submit" name="submit">
        </form>
    </body>
</html>
