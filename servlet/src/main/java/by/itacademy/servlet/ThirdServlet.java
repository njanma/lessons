package by.itacademy.servlet;

import by.itacademy.model.Dish;
import by.itacademy.service.DishService;
import by.itacademy.util.Types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@WebServlet("/dishes")
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = DishService.getInstance().getAll().stream()
                .map(this::toStringPresentation)
                .collect(Collectors.joining());

        resp.setContentType(Types.TEXT_HTML);
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.getWriter().print(value);

    }

    private String toStringPresentation(Dish dish) {
        return "<p>" + dish.getId() + " " + dish.getName() + "</p>";
    }
}
