import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/NameServlet"})
public class NameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nameInCookie = CookieHelper.getCookie(request, "name");
        if(nameInCookie != null) {
            showWelcomePage(response, nameInCookie);
            return;
        }

        String submit = request.getParameter("submit");
        if(submit != null) {
            String name = request.getParameter("name");
            CookieHelper.addCookie(response, "name", name);
            showWelcomePage(response, name);
            return;
        }
        
        showNameForm(response);
    }
    
    private void showWelcomePage(HttpServletResponse response, String name) 
            throws ServletException, IOException {
        String html = String.format("<p>Welcome %s</p>", name);
        send(response, html);
    }
    
    private void showNameForm(HttpServletResponse response) 
            throws ServletException, IOException {
        String html = "<form action='NameServlet' method='GET'>"
            + "Name: <input type='text' name='name'>"
            + "<input type='submit' value='Submit' name='submit'>"
            + "</form>";
        send(response, html);
    }
    
    private void send(HttpServletResponse response, String html) 
            throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8"); 
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>NameServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(html);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
