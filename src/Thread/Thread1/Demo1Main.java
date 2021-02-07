package Thread.Thread1;

public class Demo1Main {
    public static void main(String[] args) {
//        3.创建Thread类的子类对象
        Demo1 d1=new Demo1();
//        4.调用Thread类中的方法start（）方法,开启新的线程,执行run方法
        d1.start();

        Demo1 d2=new Demo1();
        System.out.println("==========");
        d2.start();
        System.out.println("==========");
        //主线程会继续执行主方法中的代码

        for (int i = 0; i < 1; i++) {
            System.out.println("main:"+i);
        }


    }
}
