package Thread.Thread1;
//1.创建一个Thread类的子类
public class Demo1 extends Thread{
//    2.在Thread类的子类中重写Thread类中的run方法,
//    设置线程任务(开启线程要做什么?)
    @Override
    public  void  run(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("run:"+i);
             }


    }
}
