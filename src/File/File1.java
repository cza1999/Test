package File;

import java.io.File;

public class File1 {

    public static void main(String[] args) {
        String s = File.pathSeparator;
        //路径分隔符，windows ";",linux ":"。
        System.out.println(s);

        String separator = File.separator;
        System.out.println(separator);
        //文件名称分隔符，windows 反斜杠"\",linux正斜杠 "/"。

    }
}
