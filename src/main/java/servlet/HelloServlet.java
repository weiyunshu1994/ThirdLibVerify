//1. 编写⼀个Java类实现Servlet的接口
package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
/**
 * ⽤来处理客户的请求，并且对请求作出响应的⽅法
 */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("⼀个servlet程序。。");
        //把服务器的数据 返回给浏览器显示
        // 向⻚⾯输出⼀个HelloServlet字符串:
        servletResponse.getWriter().print("<font color='red'>hello servlet</font>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
    //省略剩下⽅法，采⽤默认实现
}
