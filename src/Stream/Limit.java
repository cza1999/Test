package Stream;

import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        String[] arr={"1","2","3","4"};
        Stream<String>stream=Stream.of(arr);
        Stream<String>stream1=stream.limit(2);
        stream1.forEach(name-> System.out.println(name));

    }
}
