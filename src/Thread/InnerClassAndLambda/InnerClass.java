package Thread.InnerClassAndLambda;

public class InnerClass {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public  void run(){
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()+"=="+i);
                }
            }

        }.start();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()+"--");
                }

            }
        };new Thread(r).start();

//        简化接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()+"++++");
                }

            }
        }).start();

    }
}
