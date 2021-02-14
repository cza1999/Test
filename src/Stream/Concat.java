package Stream;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<String>stream=Stream.of("1","2","3");
        String[] arr={"a","z","c","d"};
        Stream<String>stream2=Stream.of(arr);
        Stream<String> con=Stream.concat(stream,stream2);
        con.forEach(name-> System.out.println(name));
    }
}
