package BufferedStream;


       /* -创建字节缓冲渝入流对象,构洁方法中传递字书渝入流
        2.创建字节缓冲揄出流对象,构造方法中传递字节输出流
        3.使用字节缓冲输入流对象中的方法read ,读取文件
        4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
        5.释放资源(会先把缓冲区中的数据,刷新到文件中)*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ButteredReadAndWrite {
    public static void main(String[] args) throws IOException {
        long s=System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(
      new FileInputStream("D:\\daima\\idea\\test\\src\\IO\\b.txt"));

        BufferedOutputStream bos =new BufferedOutputStream(
        new FileOutputStream(
        "D:\\daima\\idea\\test\\src\\IO\\c.txt",true));
        int len=0;
        while((len=bis.read())!=-1){
            System.out.println(len);
            bos.write(len);
        }
//        7毫秒
       /* byte[] bytes= new byte[1024];
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
            bos.write(len);
        }*/
//        1毫秒

        bos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        bis.close();
        bos.close();
        long e=System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e-s)+"毫秒");


    }
}
