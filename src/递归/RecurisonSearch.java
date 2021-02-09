package 递归;

import java.io.File;
import java.util.Locale;

//查找.java结尾的文件
public class RecurisonSearch {
    public static void main(String[] args) {
        File file=new File("D:\\daima");
//        File file=new File("D:\\daima\\idea\\test\\src");
        getAllFiles(file);

    }
    public static void getAllFiles(File dir){
        File[] files=dir.listFiles();
        for (File f:files) {
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
//                String name=f.getName();
//                String path=f.getPath();
                String s=f.toString();
                s=s.toLowerCase();
                boolean b=s.endsWith(".java");
                if(b) {
                    System.out.println(f);
                }
            }
           /* if(f.getName().toLowerCase().endsWith(".java")){
                System.out.println(f);
            }*/


        }
    }
}
