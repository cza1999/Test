package IOputStream;
/*
练习:转换文件编码
将GEK编码的文本文件,复制到UTF-8编码的文本文件。分析:

1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名利称aBK
2.创建outputstreamwriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
3.使用InputStreamReader对象中的方法read读取文件
4.使用outputstreamlriter对象中的万法write,把读取的数据写入到文件中
5.释放资源
*/

import java.io.*;

public class GBKTurnUTF {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("src\\IOputStream\\GBKturnUTF.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "src\\IOputStream\\utf-8.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        isr.close();
        osw.close();

    }
}
