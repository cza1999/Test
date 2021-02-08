package Thread.InnerClassAndLambda;

public class Lambda {
    public static void main(String[] args) {
//        使用匿名内部类实现多线程
        new Thread(){
            @Override
            public  void run(){
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()
                            +"无参"+i);
                }
            }

        }.start();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()
                            +"参数r");
                }

            }
        };new Thread(r).start();

//        简化接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName()
                            +"参数 new Runnable");
                }

            }
        }).start();
//        使用Lambda表达式实现多线程
        new Thread(()->{
            for (int i = 0; i < 6; i++) {

                System.out.println(Thread.currentThread().getName()
                        + "Lambda");
            }

        }).start();
//        省略格式
        new Thread(()->System.out.println(Thread.currentThread().getName()
                + "Lambda省略格式")).start();

    }
}
