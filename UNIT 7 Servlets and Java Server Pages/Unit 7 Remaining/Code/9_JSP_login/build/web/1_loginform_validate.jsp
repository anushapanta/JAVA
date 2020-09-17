


<%

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username.equalsIgnoreCase("anusha") && password.equalsIgnoreCase("anusha")) {
        session.setAttribute("user", username);

        response.sendRedirect("1_admin.jsp");
    } else {

        response.sendRedirect("1_loginform.jsp");

    }


%>




