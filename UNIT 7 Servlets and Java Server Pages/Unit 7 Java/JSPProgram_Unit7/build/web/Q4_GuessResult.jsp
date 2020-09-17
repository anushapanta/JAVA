<%-- 
    Document   : Q4_GuessResult
    Created on : 25-Jun-2020, 13:15:01
    Author     : user
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guessing Game</title>
    </head>
    <body>
        <% int random_number = (int) (Math.random() * 100);%>

        <% String user_no = request.getParameter("user_input");%>
        <% int user_number = Integer.parseInt(user_no);%>

        <%
            if (random_number == user_number) {
                out.println("Congratulations!!!It was correct Guess!!!");
            } else {
                out.println("Oops!!!It was Incorrect Guess..\nTry Again!!!");
                out.println("<br><br>The correct number was:" + random_number);
            }
        %>



    </body>
</html>
