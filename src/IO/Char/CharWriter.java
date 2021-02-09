package IO.Char;

import java.io.FileWriter;
import java.io.IOException;

public class CharWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter(
 "D:\\daima\\idea\\test\\src\\IO\\Char\\aa.txt");
//        把数据写入到内存缓冲区中(字符转换为字节的过程)
        fw.write("cqwe");
        fw.write("你好");
//        把内存缓冲区中的数据,刷新到文件中
        fw.flush();
        fw.close();




    }
}
