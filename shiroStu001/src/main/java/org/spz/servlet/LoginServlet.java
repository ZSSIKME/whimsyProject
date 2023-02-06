package org.spz.servlet;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.spz.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("loginName");
        String password = req.getParameter("password");
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginName, password);
        LoginServiceImpl loginService = new LoginServiceImpl();
        boolean login = loginService.login(usernamePasswordToken);
        if(!login){
            //重定向
            resp.sendRedirect("/login.jsp");
            return;
        }
        req.getRequestDispatcher("/home").forward(req,resp);
    }
}
