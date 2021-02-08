package Thread.InnerClassAndLambda;

public class LambdaStandMain{
    public static void main(String[] args) {
        invokeCook(new LambdaStand() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });
//        使用匿名表达式
        invokeCook(()->{
            System.out.println("吃饭了Lambda");
        });
//        Lambda省略格式
        invokeCook(()->System.out.println("吃饭了Lambda省略格式"));


    }
    public static  void invokeCook(LambdaStand ls){
        ls.makefood();

    }
}
