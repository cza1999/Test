package Net;
/*
实现步骤:
        1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
        2.使用Socket对象中的方法getoutputStream()获取网络字节输出流outputstream对象3.使用网络字节输出流outputstream对象中的方法vrite,给服务器发送数据
        4.使用socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        5.使用网络字节输入流Inputstream对象中的方法read,读取服务器回写的数据
        6.释放资源(Socket)
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());

        InputStream is=socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();
    }
}
