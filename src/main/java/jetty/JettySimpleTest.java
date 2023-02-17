package jetty;

import org.eclipse.jetty.server.Server;

public class JettySimpleTest {
    public static void main(String[] args) throws Exception {
        // 创建服务器
        Server server = new Server(8001);
        // 设置handler
        server.setHandler(new HelloHandler());
        // 启动应用服务并等待请求
        server.start();
        // 阻塞Jetty server的线程池，直到线程池停止
        server.join();
    }
}
