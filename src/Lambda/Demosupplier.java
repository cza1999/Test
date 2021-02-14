package Lambda;

import java.util.function.Supplier;
//定义一个方法,方法的参数传递Supplier<T>接口,泛型执行string,
// get方法就会返回一个String

public class Demosupplier {
    public  static String getString(Supplier<String>sup){
        return  sup.get();
    }

    public static void main(String[] args) {
//调用getstring方法,方法的参数Supplier是一个函数式接口,
// 所以可以传递Lambda表达式

        String s=getString(()->"胡歌");
        System.out.println(s);
    }
}
