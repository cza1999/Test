package Lambda;

import java.util.function.Predicate;

public class Demo1Predicate {
    public static boolean checkString(String s, Predicate<String>pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s="abcde";
        boolean b=checkString(s,(String str)->{
            return str.length()>4;
        });
        System.out.println(b);

    }
}
