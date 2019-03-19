package by.itacademy.servlet.extend;

import by.itacademy.util.ServletConst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.itacademy.util.ServletConst.NUMBER_ATTRIBUTE;

@WebServlet("/saveNumber")
public class NumberSaveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().setAttribute(NUMBER_ATTRIBUTE, 10);
    }
}
