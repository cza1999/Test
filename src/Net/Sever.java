package Net;
/*
文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功”明确:
        数据源:客户端上传的文件
        自的地:服务器的硬盘d : liupLoad\l1.jpg
        实现步骤:
        1.创建一个服务器serverSocket对象,和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端socket对象
        3.使用Socket对象中的方法getInputstream,获取到网络字节输入流Inputstream对象4.判断d : lluptoad文件央是否存在,不存在则创建
        5.创建一个本地字节输出流FiLeoutputstream对象,构造方法中绑定要输出的目的地6.使用网络字节输入流Inputstream对象中的方法read ,读取客户端上传的文件
        7.使用本地字节输出流FiLeoutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上8.使用Socket对象中的方法getoutputStream ,获取到网络字节输出流outputStream对象
        9.使用网络字节输出流outputStream对象中的方法write ,给客户端回与"上传成功”
        10.释放资源(FileOutputStream, Socket, ServerSocket
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws Exception{
        ServerSocket serve = new ServerSocket(8888);
        Socket socket=serve.accept();
        InputStream is=socket.getInputStream();
        File file=new File("D:\\桌面");
        if(!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fos=new FileOutputStream(file+"\\MYSQL笔记.pdf");
        int len=0;
        byte[] bytes = new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
        serve.close();

    }
}
