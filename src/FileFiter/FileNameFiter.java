package FileFiter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Locale;

public class FileNameFiter {
    public static void main(String[] args) {
        File file=new File("D:\\daima");
//        File file=new File("D:\\daima\\idea\\test\\src");
        getAllFiles(file);


    }
    public static void getAllFiles(File dir){
       /* File[] files=dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase(Locale.ROOT).endsWith(".java");
            }
        });*/
//        lambda表达式
       /* File[] files=dir.listFiles((File d,String name)->{
            return new File(d,name).isDirectory()||name.toLowerCase(Locale.ROOT).endsWith(".java");

        });*/
//        简化
        File[] files=dir.listFiles((d,name)->new File(d,name).isDirectory()||name.toLowerCase(Locale.ROOT).endsWith(".java"));




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
