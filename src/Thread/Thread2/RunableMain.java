package Thread.Thread2;

/*
3.创建一个Runnable接口的实现类对象
        4.创建Thread类对象,构造方法中传递RunnabLe接口的实现类对象
        5.调用Thread类中的start方法,开启新的线程执行run方法
*/

import Thread.Thread2.Runable;
import Thread.Thread2.Runable2;

public class RunableMain {
    public static void main(String[] args) {
        Runable run  = new Runable();
//        Thread t=new Thread(run);
        Thread t=new Thread(new Runable2());
        t.start();
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }


    }
}
