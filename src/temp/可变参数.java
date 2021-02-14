package temp;
/*
是JDK1.5之后出现的新特性
        使用前提:
        当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数．
        使用格式:定义方法时使用
        修饰符 返回值 类型方法名(数据类型...变量名) { }
        可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数传速的参数个数,可以是0个(不传递),1,2...多
*/
/*
定义计算(e-n)整数和的方法
        已知:计算整数的和,数据类型已经确定int
        但是参数的个数不确定,不知道要计算几个整数的和,就可以使用可变参数add();就会创建一个长度为的数组,new int[ej
        add(10);就会创建一个长度为1的数组,存储传递来过的参数new int[]{10};
        add(10,20);就会创建一个长度为2的数组,存储传递来过的参数new int[]{10,20};
*/

public class 可变参数 {
    public static void main(String[] args) {
        int i=add(10,20,30);
        System.out.println(i);

    }
    public static int add(int...arr){
      /*  System.out.println(arr);
        System.out.println(arr.length);
        return 0;*/
        int sum=0;
        for (int i:arr
             ) {
            sum+=i;
        }
        return  sum;
    }
}
