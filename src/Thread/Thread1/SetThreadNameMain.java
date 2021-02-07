package Thread.Thread1;
/*
1.使用Thread类中的方法setName(名字)
        void setName ( String name）改变线程名称，使之与参数name 相同。
  2.创建一个带参数的构造方法,参数传递线程的名称;
 调用父类的带参构造方法，把线程名称传递给父类,让父类(Thread)给子线程起一个名字
        Thread(String name)分配新的 Thread 对象。
*/

public class SetThreadNameMain {

    public static void main(String[] args) {
        String mainName=null;
        SetThreadName stn=new SetThreadName();
        stn.setName("子线程1");
        stn.start();
        //方法2
        new SetThreadName("子线程2").start();

        System.out.println(Thread.currentThread().getName());

    }
}
