package cn.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author xiaoqiang
 * @date 2018/8/19 - 15:56
 */
@WebServlet(name = "GServlet")
public class GServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* String s = "hello outputStream";
        byte[] bytes = s.getBytes();
        response.getOutputStream().write(bytes);*/
        ServletOutputStream outputStream = response.getOutputStream();
        String path = "C:/Users/xu/Desktop/新建文件夹/图片/timg.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len = bis.read(bytes, 0, bytes.length)) != -1) {
            outputStream.write(bytes, 0, len);
        }





    }
}
