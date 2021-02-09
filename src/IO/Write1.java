package IO;

import java.io.FileOutputStream;
import java.io.IOException;
/*
字节输出流的使用步骤(重点)∶
     1.创建一个FileoutputStream对象,构造方法中传递写入数据的目的地
    2.调用FileoutputStream对象中的方法vrite把数据写入到文件中
 3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空,提供程序的效率)
*/

public class Write1 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream(
                "D:\\daima\\idea\\test\\src\\IO\\a.txt");
        fos.write(99);
        fos.write(50);
        fos.write(51);
        fos.write(49);
        fos.write(149);
        fos.close();

    }
}
