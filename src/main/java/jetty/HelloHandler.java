package jetty;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloHandler extends AbstractHandler {
    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        // 设置类型，指定编码utf8
        httpServletResponse.setContentType("text/html; charset=utf-8");
        // 设置响应状态码
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        // 写响应数据
        httpServletResponse.getWriter().write("<h1>HelloHandler</h1>");
        // 标记请求已处理，handler链
        request.setHandled(true);
    }
}
