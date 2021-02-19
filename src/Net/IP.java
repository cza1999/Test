package Net;

import java.net.InetAddress;

public class IP {
    public static void main(String[] args) throws Exception {
        InetAddress localAddress = InetAddress.getLocalHost();
        InetAddress remoteAddress = InetAddress.getByName("www.sohu.com");
        InetAddress BaiduAddress = InetAddress.getByName("www.baidu.com");
        System.out.println("本机的IP地址：" + localAddress.getHostAddress());

        System.out.println("sohu的IP地址：" + remoteAddress.getHostAddress());
        System.out.println("3秒是否可达：" + remoteAddress.isReachable(3000));
        System.out.println("sohu的主机名为：" + remoteAddress.getHostName());

        System.out.println("baidu的IP地址：" + BaiduAddress.getHostAddress());
        System.out.println("3秒是否可达：" + BaiduAddress.isReachable(3000));
        System.out.println("百度的主机名为：" + BaiduAddress.getHostName());
    }
}
