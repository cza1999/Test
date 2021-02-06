package test;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //如何进行升序排列,sort
//        必须是一个数组,才能用Ar-rays . sort方法
//        String -->数组，用tocharArrayy
        String str="wdcvgreryhjy6rasvb";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1 ;i>=0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
