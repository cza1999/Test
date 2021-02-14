package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkHash {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("a");
        set.add("z");
        set.add("x");
        set.add("c");
        set.add("c");
        System.out.println(set);

        LinkedHashSet<String> Lset=new LinkedHashSet<>();
        Lset.add("a");
        Lset.add("z");
        Lset.add("x");
        Lset.add("c");
        Lset.add("c");
        System.out.println(Lset);
    }
}
