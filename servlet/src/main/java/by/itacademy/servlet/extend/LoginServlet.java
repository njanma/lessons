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

import static by.itacademy.util.ServletConst.USER;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute(USER);
        if (user == null) {
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            if (firstName != null && lastName != null) {
                req.getSession().setAttribute(USER, new User(firstName, lastName, User.Role.ADMIN));
            } else {
                resp.setContentType("text/html");
                resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
                resp.getWriter().write("Введите имя и фамилию пользователя!");
            }
        }

    }
}
