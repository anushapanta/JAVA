/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/Q7_LoginForm"})
public class Q7_LoginForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginFormjsp</title>");
            out.println("</head>");
            out.println("<body>");

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            HttpSession session = request.getSession(true);
            if ((username.equalsIgnoreCase("anusha") && password.equalsIgnoreCase("anusha"))) {
                session.setAttribute("username", username);
                response.sendRedirect("Q7_Home");
            } else {
                out.println("\nLogin Unsuccessfull");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

}
