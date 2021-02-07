package Thread.Thread2;
/*
1.创建一个Runnable接口的实现类
        2.在实现类中重写Runnable接口的run方法,设置线程任务
*/

public class Runable implements  Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }

}
