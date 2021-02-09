package IOputStream;
/*
使用步骤:
1.创建outputStreamwriter对象,构造方法中传递字节输出流和指定的编码表名称
2.使用outputstreamwvriter对象中的方法write,把字符转换为字节存储缓冲区中(编码）
3.使用outputStreamwriter对象中的方法fLush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
4 .释放资源
*/

import java.io.*;

public class OutputStreamGbk {
    public static void main(String[] args)throws IOException {
        read_gbk();

    }

    private  static  void read_gbk() throws  IOException{
        InputStreamReader isw=new InputStreamReader(new FileInputStream(
                "D:\\daima\\idea\\test\\src\\IOputStream\\GBk格式.txt"),"GBK");
        int len=0;
        while((len=isw.read())!=-1){
            System.out.println((char)len);
        }
        isw.close();

    }



}
