package DemoPrintStream;
/*
可以改变输出语句的目的地(打印流的流向)输出语句,默认在控制台输出
        使用System.setout方法改变输出语句的目的地改为参数中传递的打印流的目的地
static void setout( PrintStream out)
        重新分配“标准”输出流。
*/

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DemoPS2 {
    public static void main(String[] args) throws FileNotFoundException {
//        在程序先前保存原输出流
        PrintStream old=System.out;
        System.out.println("控制台");
//        新输出流
        PrintStream ps = new PrintStream("src/DemoPrintStream/ps.txt");
        System.setOut(ps);
        System.out.println("输出到文件");
//恢复原输出流
        System.setOut(old);

        System.out.println("控制台1");
        ps.close();


    }

}
