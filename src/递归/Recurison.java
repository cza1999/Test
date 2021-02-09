package 递归;

import java.io.File;

//递归打印目录
public class Recurison {
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
                System.out.println(f);
            }


        }
    }
}
