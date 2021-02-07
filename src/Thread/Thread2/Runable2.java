package Thread.Thread2;

public class Runable2 implements  Runnable{
    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World"+ "=="+i);
        }

    }
}
