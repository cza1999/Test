package test;
import  java.util.Random;

public class random {
    public static void main(String[] args) {
       Random r= new Random();
       int num=r.nextInt();
       System.out.println(num);
    }
}
