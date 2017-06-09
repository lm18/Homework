package myServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Admin on 24.09.2016.
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("text");
        String option = req.getParameter("option");
        resp.setContentType("text/html; charset=UTF-8");
        if (option.equals("1")) {
            resp.getWriter().println("<html><body><center><p>" + "Количество символов: " + text.length() + "</p></center></body></html>");
        } else if (option.equals("2")) {
            resp.getWriter().println("<html><body><center><p>" + "Количество слов: " + text.split(" ").length + "</p></center></body></html>");
        } else {
            resp.sendRedirect("/index.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}