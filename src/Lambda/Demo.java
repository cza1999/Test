package Lambda;

public class Demo {
    public static  void show( demointerface myInter){
        myInter.method();

    }

    public static void main(String[] args) {
        //调用show方法,方法的参数是一个接口,所以可以传递接口的实现类对象

        show(new DemoImp());
//调用show方法,方法的参数是一个接口,所以我们可以传递接口的匿名内部类
        show(new demointerface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");

            }
        });
        //调用showi方法,方法的参数是一个函数式接口,所以我们可以Lambda表达式
        show(()->{
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });
        show(()->System.out.println("使用简化Lambda表达式重写接口中的抽象方法"));
    }
}
