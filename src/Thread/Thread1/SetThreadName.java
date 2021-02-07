package Thread.Thread1;

public class SetThreadName extends Thread {
    //方法1
        @Override
    public  void  run(){
            System.out.println(Thread.currentThread().getName());
        }
        //方法2
    public  SetThreadName(){};
        public SetThreadName(String name){
            super(name);
        }


}
