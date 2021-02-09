package IO.Char;
/*
java.io.Reader :字符输入流,是字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类共性的成员方法:
        int read(读取单个字符并返回。
        int read ( char[]cbuf)一次读取多个字符,将字符读入数组。
        void close(关闭该流并释放与之关联的所有资源。
        java.io.FiLeReader extends InputstreamReader extends Reader
        FileReader:文件字符输入流
        作用:把硬盘文件中的数据以字符的方式读取到内存中
        构造方法:
        FiLeReader(String fiLeName )
        FiLeReader(File file)
        参数:读取文件的数据源
        String fiLeName :文件的路径
        FiLe file:一个文件
        FiLeReader构造方法的作用:
        1.创建一个FileReader对象
        2.会把FiLeReader对象指向要读取的文件
*/

import java.io.FileReader;
import java.io.IOException;

public class CharRead {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader(
         "D:\\daima\\idea\\test\\src\\IO\\Char\\cza.txt");
        int len=0;
        while((len=fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();

    }
}
