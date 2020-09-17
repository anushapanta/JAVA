<%-- 
    Document   : 1_loginform
    Created on : 26-Jun-2020, 10:34:42
    Author     : user
--%>


<html>
    <head>
        <title>Login Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Welcome to Login Page !!!!</h1>

        <form action="1_loginform_validate.jsp" method="POST">
            Username:<input type="text" name="username">
            <br/>
            Password:<input type="password" name="password">
            <br/>        
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
