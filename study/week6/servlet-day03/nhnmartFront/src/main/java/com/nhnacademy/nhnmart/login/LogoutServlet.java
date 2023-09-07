package com.nhnacademy.nhnmart.login;

import com.nhnacademy.nhnmart.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Objects;
@WebServlet(name = "logoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //session 있으면 가져오고 없으면 null
        HttpSession session = req.getSession(false);

        if(Objects.nonNull(session)) {
            session.invalidate();
        }

        Cookie cookie =  CookieUtils.getCookie(req,"JSESSIONID");
        if(Objects.nonNull(cookie)){
            cookie.setValue("");
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }

//        resp.sendRedirect("/views/loginForm.jsp");
        req.setAttribute("view", "redirect:/views/loginForm.jsp");
    }
}