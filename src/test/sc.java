package test;
import java.util.Scanner;
public class sc {
    public static void main(String[] args) {
//1普通方式
    /* 1 Scanner sc = new Scanner(System.in) ;
      String num =sc.next();
      System.out.println(num);*/
// 2匿名对象方式
       /* int num=new Scanner(System.in).nextInt();
        System.out.println(num);*/
// 3一般写法传入参数
       /* Scanner sc=new Scanner(System.in);
        methodParam(sc);*/
// 4匿名对象传参
       /* methodParam(new Scanner(System.in));*/
// 5
        Scanner sc=methodReturn();
        int num = sc.nextInt();
        System.out.println(num);
    }
//   3,4调用
    public  static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }
//  5调用
    public static Scanner methodReturn(){
        return  new Scanner(System.in);
//  与下边两句意思一样，
//        Scanner sc=new Scanner(System.in);
//        return sc;
    }
}
