package cn.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiaoqiang
 * @date 2018/8/19 - 10:46
 * 演示从定向
 * 用户请求BServlet 然后发送 302 给出Location头
 * 转给CServlet
 */
@WebServlet(name = "BServlet")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("BServlet");
        /*从定向
        *设置Location
        * 发送302状态码
        *
        * 项目名，+Servlet 请求url
        * */
//        response.setHeader("Location", "/RWeb/CServlet");
//        response.setStatus(302);
        //快捷的重定向方法
        response.sendRedirect("/RWeb/GServlet");

    }
}
