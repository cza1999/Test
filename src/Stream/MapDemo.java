package Stream;

import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("1","2","3","4");
        Stream<Integer> stream1=stream.map((String s)->Integer.parseInt(s));
        stream1.forEach(i-> System.out.println(i));
    }
}

