package Lambda;

import java.util.function.Function;

public class DemoFuoction{
    public static void change(String s, Function<String,Integer>fun){
        Integer in=fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s="1232";
        change(s,str->Integer.parseInt(str));
    }
}
