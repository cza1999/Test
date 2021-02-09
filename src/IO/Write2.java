package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/*
字节输出流的使用步骤(重点)∶
     1.创建一个FileoutputStream对象,构造方法中传递写入数据的目的地
    2.调用FileoutputStream对象中的方法vrite把数据写入到文件中
 3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空,提供程序的效率)
 一次写多个字节
 - public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流。
- public void write(byte[ ] b， int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
如果写的第一个字节是正数(0-127),那么显示的时候会查询AscII表
如果写的第一个字节是负数，那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)

*/

public class Write2 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream(
                "D:\\daima\\idea\\test\\src\\IO\\b.txt");
        byte[] byt={22,33,5,67,55};
        fos.write(byt);
        fos.write(byt,1,4);


        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();

    }
}
