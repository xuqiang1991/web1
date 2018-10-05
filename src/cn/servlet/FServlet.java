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
 * @date 2018/8/19 - 15:37
 */
@WebServlet(name = "FServlet")
public class FServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        /*
        *  Cache-Control   pragma   expires
        * */
        response.setHeader("Cache-Control", "no-cacge");
        response.setHeader("pragma", "no-cacge");
        response.setHeader("expires", "-1");

        pw.print("hello world");

    }
}
