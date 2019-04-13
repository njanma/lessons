package by.itacademy.servlet;

import by.itacademy.util.JspHelper;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

@WebServlet("/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("application",
                new Locale(req.getParameter("lang")));
        resp.setCharacterEncoding("UTF-8");
        req.setAttribute("user", new User(resourceBundle.getString("name"), 12));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("name"))
                .forward(req, resp);
    }

    @Data
    @AllArgsConstructor
    public class User{
        String name;
        Integer age;
    }
}
