package by.itacademy.servlet.extend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {

    private static final String COUNTER_KEY = "userId";
    private AtomicInteger counter = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        boolean exists = cookies != null && Arrays.stream(cookies)
                .anyMatch(it -> COUNTER_KEY.equals(it.getName()));
        if (!exists) {
            resp.addCookie(createCookie());
            counter.incrementAndGet();
        }
        resp.getWriter().write("Count: " + counter.get());
    }

    private Cookie createCookie() {
        Cookie cookie = new Cookie(COUNTER_KEY, "dummy");
        cookie.setMaxAge(-1);
        return cookie;
    }
}
