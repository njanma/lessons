package by.itacademy.servlet;

import by.itacademy.dto.RequestDto;
import by.itacademy.util.JspHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("request222", new RequestDto(1,"Some description", "2018-08-09"));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("request"))
                .forward(req, resp);
    }
}
