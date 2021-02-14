package Lambda;

import java.util.function.Function;

public class DemoFuoction1 {
    public static void change(String s, Function<String,Integer>fun1, Function<Integer,String>fun2){
       String in=fun1.andThen(fun2).apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "123";
      /*  change(s, (String str)->{
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            return i+"";
        });*/
        change(s,str->Integer.parseInt(str)+10,i-> i+"");

    }
}
