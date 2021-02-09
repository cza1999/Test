package FileFiter;

import java.io.File;
import java.io.FileFilter;

//查找.java结尾的文件
public class FileFilter1Main {
    public static void main(String[] args) {
        File file=new File("D:\\daima");
//        File file=new File("D:\\daima\\idea\\test\\src");
        getAllFiles(file);

    }
    public static void getAllFiles(File dir){
        File[] files=dir.listFiles(new FilrFilter1()) ;

        for (File f:files) {
            if (f.isDirectory()) {
                getAllFiles(f);
            } else {
//
                System.out.println(f);

            }
        }

    }
}
