package BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
java.io.Bufferedoutputstream extends outputstream
        Bufferedoutputstream:字节缓冲输出流
        继承自父类的共性成员方法:
public void close():关闭此输出流并释放与此流相关联的任何系统资源。
        - public void flush() :刷新此输出流并强制任何缓冲的输出字节被写出。
        - public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流。
        - public void write(byte[ ] b, int off, int len) :从指定的字节数组写入len字节，从偏移量 off开始输出到此输出流。
        - public abstract void write(int b):将指定的字节输出流。
        构造方法:
        BufferedOutputStream(OutputStream out)创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
        BufferedOutputStream(OutputStreom out，int size)创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流
        参数:
        OutputStream out:字节输出流
        我们可以传递FiLeoutputStream,缓冲流会给FiLeOutputStream增加一个缓冲区,提高FileOutputStream的写入效率
        int size:指定缓冲流内部缓冲区的大小,不指定默认
        使用步骤(重点)
        1.创建FiLeoutputstream对象,构造方法中绑定要输出的目的地
        ⒉.创建BufferedoutputStreom对象,构造方法中传递FiLeoutputStream对象对象,提高FileOutputStream对象效率
        3.使用Bufferedoutputstream对象中的方法write ,把数据写入到内部缓冲区中
        4 .使用BufferedOutputstream对象中的方法flush,把内部缓冲区中的数据,刷新到文件中
        5 .释放资源(会先调用fLush方法刷新数据,第4部可以省略)
*/

public class BufferadOutput {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream(
 "D:\\daima\\idea\\test\\src\\BufferedStream\\ss.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("写到内部缓冲区".getBytes());
        bos.flush();
        bos.close();


    }

}
