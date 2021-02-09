package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\daima\\idea\\test\\src\\IO\\c.txt");
//    int read()读取文件中的一个字节并返回，读取到文件的末尾返回-1
        int len = 0;
        while ((len = fis.read()) != -1) {

            System.out.println(len);
        }
        fis.close();
    }
}
