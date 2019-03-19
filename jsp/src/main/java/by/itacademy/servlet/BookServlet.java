package by.itacademy.servlet;

import by.itacademy.dto.BookDto;
import by.itacademy.util.JspHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookServlet extends HttpServlet {

    public static void main(String[] args) {
        char test1 = 'Z';
        char test2 = 'a';
        System.out.println((int) test1);
        System.out.println((int) test2);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("book", new BookDto("Java 8. Шилдт"));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("book"))
                .forward(req, resp);
    }
}
