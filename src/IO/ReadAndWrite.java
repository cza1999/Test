package IO;
/*文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的自的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(
                "D:\\daima\\idea\\test\\src\\IO\\b.txt");
        FileOutputStream fos = new FileOutputStream(
                "D:\\daima\\idea\\test\\src\\IO\\c.txt",true);
        int len=0;
     /*   while((len=fis.read())!=-1){
            System.out.println(len);
            fos.write(len);
        }*/
//        7毫秒
        byte[] bytes= new byte[1024];
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
            fos.write(len);
        }
//        1毫秒

        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fis.close();
        fos.close();
        long e=System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e-s)+"毫秒");


    }
}
