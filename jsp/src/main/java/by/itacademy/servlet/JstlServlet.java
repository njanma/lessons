package by.itacademy.servlet;

import by.itacademy.dto.RequestDto;
import by.itacademy.util.JspHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("request1", RequestDto.builder()
//                .description("test")
//                .build());
//        req.setAttribute("request2", RequestDto.builder()
//                .description("asdgsdfgh")
//                .build());
        req.setAttribute("requests", Arrays.asList(
                RequestDto.builder()
                        .id(1)
                        .date("2018-02-03")
                        .description("test 2222222")
                        .build(),
                RequestDto.builder()
                        .id(2)
                        .date("2018-03-09")
                        .description("test 3")
                        .build()
        ));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("jstl"))
                .forward(req, resp);
    }
}
