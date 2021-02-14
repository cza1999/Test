package Net;
/*
文件上传案例的客户端;读取本地文件,上传到服务器,读取服务器回写的数据明确:
        数据源:c:1l1.jpg目的地:服务器
        实现步骚:
        1.创建一个本地字节输入流FiLeInputstream对象，构造方法中绑定要读取的数据源2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        3.使用Socket中的方法getoutputstream,获取网络字节输出流outputstream对象4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        5.使用网络字节输出流Outputstream对象中的方法vrite,把读取到的文件上传到服务器6.使用Socket中的方法getInputstream,获取网络字节输入流Inputstream对象
        7.使用网络字节输入流Inputstream对象中的方法read读取服务回写的数据
        8.释放资源(FiLeInputStream , socket)
*/

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEst {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream(
                "D:\\daima\\c\\0-1背包.exe");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);

        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }
}
