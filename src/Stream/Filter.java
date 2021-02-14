package Stream;

import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("张三","李四","王五");
        Stream<String> stream2=stream.filter((String name)->name.startsWith("张"));
    stream2.forEach(name-> System.out.println(name));

    }
}
