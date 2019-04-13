package by.itacademy.servlet;

import by.itacademy.dto.RequestDto;
import by.itacademy.service.RequestService;
import by.itacademy.util.JspHelper;
import by.itacademy.validator.RequestValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request-save")
public class RequestSaveServlet extends HttpServlet {

    private RequestValidator requestValidator = new RequestValidator();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("request-save"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDto requestDto = RequestDto.builder()
                .description(req.getParameter("description"))
                .date(req.getParameter("date"))
                .build();
        if (requestValidator.isValid(requestDto)) {
            RequestService.getInstance().save(requestDto);
            resp.sendRedirect("/request-success");
        } else {
            resp.sendRedirect("/request-save");
        }
    }
}
