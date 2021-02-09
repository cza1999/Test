package File;
import java.io.File;
public class 构造方法 {
    public static void main(String[] args) {
        File file1=new File("D:\\daima\\idea\\mysql\\jdbc\\src");
        System.out.println(file1);

        File file2=new File("D:\\daima","\\2mysql\\jdbc\\src");
        System.out.println(file2);

        File parent=new File("D:\\daima");
      
        File file3=new File(parent,"\\3mysql\\jdbc\\src");
        System.out.println(file3);

    }
}
