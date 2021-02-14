package Lambda;
//函数式接口作为参数
public class Lambda1 {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }
    public static  void main(String[] args){
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动");
            }
        });
        startThread(()->
                System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
}
