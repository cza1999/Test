package Thread.Thread1;

public class GetThreadName extends  Thread {
    //重写Thread类中的run方法,设置线程任务

    @Override
    public void  run(){
        //获取线程名称 方法1
       /* String name=getName();
        System.out.println(name+"a");*/
        //方法2
    /*    Thread t=Thread.currentThread();
        System.out.println(t+"b");*/
        //合并
        System.out.println(Thread.currentThread().getName()+"c");
    }

}
