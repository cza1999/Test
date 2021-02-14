package DemoPrintStream;
/*
java.io.PrintStream:打印流
        printStream为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。PrintStream特点:
        1.只负责数据的输出,不负责数据的读取
        2.与其他输出流不同，PrintStream永远不会抛出IOException
        3.有特有的方法, print , printLn
        void print(任意类型的值)
        void printLn(任意类型的值并换行)
        构造方法:
        Printstream(File file):输出的目的地是一个文件
        PrintStream ( OutputStream out):输出的目的地是一个字节输出流
        PrintStream(String fileName):输出的目的地是一个文件路径
        PrintStream extends OutputStream
        继承自父类的成员方法:
public void close():关闭此输出流并释放与此流相关联的任何系统资源。
        - public void flush():刷新此输出流并强制任何缓冲的输出字节被写出。
        - public void iwrite(byte[] b):将b.length字节从指定的字节数组写入此输出流。
public void write(byte[] b， int off, int len) :从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。
public abstract void write(int b):将指定的字节输出流。
        注意:

        如果使用继承自父类的write方法写数据,那么查看数据的时候会查询编码表97->a
        如果使用自己特有的方法print/println方法写数据，写的数据原样输出97->97
*/

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DemoPS {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("src/DemoPrintStream/ps.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
