package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/*
字节输出流的使用步骤(重点)∶
     1.创建一个FileoutputStream对象,构造方法中传递写入数据的目的地
    2.调用FileoutputStream对象中的方法vrite把数据写入到文件中
 3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空,提供程序的效率)
 一次写多个字节

*/

public class AddWrite {
    public static void main(String[] args)throws IOException {
//       追加写
        FileOutputStream fos=new FileOutputStream(
"D:\\daima\\idea\\test\\src\\IO\\c.txt",false);
      /*  byte[] byt={22,33,5,67,55};
        fos.write(byt);
        fos.write(byt,1,4);
*/
       /* byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();*/

        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes(StandardCharsets.UTF_8));

        }

    }
}
