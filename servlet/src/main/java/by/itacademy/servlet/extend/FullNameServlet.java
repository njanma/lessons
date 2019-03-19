package by.itacademy.servlet.extend;

import by.itacademy.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.itacademy.util.StringUtil.defaultIfEmpty;

@WebServlet("/fullName")
public class FullNameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        resp.setContentType("text/html");
        resp.getWriter().write("<p>" + defaultIfEmpty(firstName) + " " +
                defaultIfEmpty(lastName) + "</p>");
    }
}
