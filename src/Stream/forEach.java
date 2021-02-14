package Stream;

import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        Stream<String>stream=Stream.of("张三","李四");
        stream.forEach((String name)-> System.out.println(name));
    }
}
