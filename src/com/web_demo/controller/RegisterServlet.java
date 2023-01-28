package com.web_demo.controller;

import com.web_demo.entity.User;
import com.web_demo.entity.vo.LoginMessageModel;
import com.web_demo.entity.vo.RegisterMessageModel;
import com.web_demo.mapper.UserMapper;
import com.web_demo.service.UserService;
import com.web_demo.util.GetSqlSession;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    // 实例化UserService对象
    private UserService userService = new UserService();

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // 注册业务处理
        // 1. 接受客户端的请求（接受参数：待注册的用户名，密码，确认密码）
        String rname = request.getParameter("rname");
        String rpwd = request.getParameter("rpwd");
        String rspwd = request.getParameter("rspwd");
        //System.out.println(rname + rpwd + rspwd);
        // 2. 调用service层的方法，返回消息模型对象
        RegisterMessageModel messageModel = userService.userRegister(rname, rpwd, rspwd);
        // 3. 判断消息模型的状态码
        if(messageModel.getCode() == 1){// 成功
            // 将消息模型中的用户信息设置到session作用域中，重定向到跳转到login.jsp
            request.getSession().setAttribute("user", messageModel.getObject());
            response.sendRedirect("login.jsp");
        }else{// 失败
            // 将消息模型设置到request作用域中，请求转发到register.jsp
            request.setAttribute("messageModel", messageModel);
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
