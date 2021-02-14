package Stream;

import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(123);
        list.add(1234);
        list.add(12345);
        long stream=list.stream().count();
        System.out.println(stream);
    }
}
