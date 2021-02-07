package Thread.Thread1;

public class GetThreadNameMain {
    public static void main(String[] args) {
        //创建子类对象
        GetThreadName gtn=new GetThreadName();
        //调用start方法，开辟新线程
        gtn.start();
      new GetThreadName().start();
        /*for (int i = 0; i <7 ; i++) {
            System.out.println(i);

        }*/

        System.out.println(Thread.currentThread().getName());

    }
}
