package Lambda;
/*
练习:求数组元素最大值
        使用supplier接口作为方法参数类型，通过Lambda表达式求出int数组
        中的最大值。提示:接口的泛型请使用java.Lang.Integer类。
*/

import java.util.function.Supplier;
//定义一个方法,用于获取int类型数组中元素的最大值,方法的参数传递
// Supplier接口,泛型使用Integer

public class Demosupplier1 {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr={100,30,-34,0,1};
       int m= getMax(()->{
           int max=arr[0];
            for (int i:arr) {
                if (i>arr[0]){
                    max=i;

                }
            }
            return max;
        });
        System.out.println(m);
    }

}
