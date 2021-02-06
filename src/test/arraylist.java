package test;
import java.util.ArrayList;
/*
数组的长度不可以发生改变。但是Arraylist集合的长度是可以随意变化的。
对于ArrayList来说。有一个实括号<E>代表泛型。也就是装在集合当中的所有元素。
全都是统一的什么类型。注意。泛型只能是引用类型，不能是基本类型。
注意事项:
对于Araylist集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号[ ]。
*/

public class arraylist {
    public static void main(String[] args) {
        //创建了一个ArrayList集合。集合的名称是List，里面装的全都是string字符串类型的数据
        // 备注。从JDK 1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
//    向集合当中加一些数据。需要用到add方法。
        list.add("赵丽颖");
        System.out.println(list);//[赵丽颖J
        list.add("迪丽热巴");
        list.add("2345");
        list.add("qwert");
        int size= list.size();
        System.out.println(list);
        System.out.println(size);
        System.out.println(list.get(2));
        list.remove(2);//删除
        System.out.println(list.get(2));
        System.out.println(list.size());


    }

}