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
 * @date 2018/8/19 - 12:10
 */
@WebServlet(name = "DServlet")
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //定时刷新的操作
        PrintWriter pw = response.getWriter();
        pw.print("欢迎XXX登录！5秒钟后会自动跳转到主页！你看到的一定是乱码");
        /*
        * 设置名为 Refresh的响应头
        * */
        response.setHeader("Refresh", "5;URL=/RWeb/EServlet");

    }
}
