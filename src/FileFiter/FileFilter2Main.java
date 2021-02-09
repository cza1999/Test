package FileFiter;

import java.io.File;
import java.io.FileFilter;

//查找.java结尾的文件
//传递过滤器对象使用匿名内部类

public class FileFilter2Main {
    public static void main(String[] args) {
        File file=new File("D:\\daima");
//        File file=new File("D:\\daima\\idea\\test\\src");
        getAllFiles(file);

    }
    public static void getAllFiles(File dir){
        File[] files=dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname){
//                文件夹或是.javd结尾的文件返回true
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
            }
        });


        for (File f:files) {
            if(f.isDirectory()){
                getAllFiles(f);
            }else{
//
                    System.out.println(f);

            }



        }
    }
}
