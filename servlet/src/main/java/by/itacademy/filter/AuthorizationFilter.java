package by.itacademy.filter;

import by.itacademy.dto.User;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static by.itacademy.dto.User.Role.ADMIN;

@WebFilter(servletNames = {"AdminPanel"})
public class AuthorizationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if (isUserAdmin(servletRequest)) {
            ((HttpServletRequest) servletRequest).getSession()
                    .setAttribute("session_id", "dhas12i12312h3i123u");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            ((HttpServletResponse) servletResponse).sendRedirect("/login");
        }
    }

    @Override
    public void destroy() {

    }

    public boolean isUserAdmin(ServletRequest servletRequest) {
        User user = (User) ((HttpServletRequest) servletRequest)
                .getSession()
                .getAttribute("user");
        return Objects.nonNull(user) && user.getRole() == ADMIN;
    }
}
