package Thread.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
//1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool
// 生产一个指定线程数量的线程池

        ExecutorService es= Executors.newFixedThreadPool(2);
//3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,
// 执行run方法

        es.submit(new runnable());
//线程池会一直开启,使用完了线程,会自动把线程归还给线程池,线程可以继续使用

        es.submit(new runnable());
        es.submit(new runnable());
//4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
        es.shutdown();
        //抛异常,线程池都没了

        es.submit(new runnable());
    }
    }

