package test;
/*
Debug调试程序:
        可以让代码逐行执行,查看代码执行的过程,调试程序中出现的bug使用方式:
在行号的右边,鼠标左键单击,添加断点(每个方法的第一行,哪里有bug添加到哪里)右键,
选择Debug执行程序,程序就会停留在添加的第一个断点处执行程序:
        f8:逐行执行程序
        f7:进入到方法中
        shift+f8:跳出方法
        f9:跳到下一个断点,如果没有下一个断点,那么就结束程序
        ctrL+f2:退出debug模式,停止程序
        consoLe:切换到控制台
*/

public class Debug {
    public static void main(String[] args) {
      /*  int a=10;
        int b=3;
        int c=a+b;
        System.out.println(c);*/
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
