package by.itacademy.servlet.extend;

import by.itacademy.dto.User;
import by.itacademy.util.ServletConst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static by.itacademy.util.StringUtil.defaultIfEmpty;

@WebServlet("/fullName2")
public class FullName2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute(ServletConst.USER);
        if (user != null) {
            resp.setContentType("text/html");
            resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
            resp.getWriter().write("<p>" + user.fullName() + "</p>");
        }
    }
}
