package Lambda;

import java.util.function.Predicate;

public class Demo2PredicateAnd {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s)&&pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s="asdasd";
        boolean b=checkString(s,(String str)-> {
            return str.length() > 5;
        },(String str)-> {
        return str.contains("b");

        });
        System.out.println(b);
    }

}
