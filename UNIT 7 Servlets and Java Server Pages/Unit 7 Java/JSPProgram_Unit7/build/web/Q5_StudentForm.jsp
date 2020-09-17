<%-- 
    Document   : Q5_StudentForm
    Created on : 25-Jun-2020, 19:06:15
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Record Form</title>
    </head>
    <body>
        <h1>Fill Up the Student Form!!!!!<hr></h1>
        <form action="Q5_Student_Display.jsp" method="POST">
            Full Name :<input type="text" name="full_name"><br>
            Address   :<input type="text" name="address"><br>  
            Age       :<input type="text" name="age"><br>
            College   :<input type="text" name="college_name"><br>
            Phone     :<input type="text" name="phone"><br>
            <input type="submit" name="submit">
        </form>
    </body>
</html>
