package Lambda;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void method(String name, Consumer<String> conn) {
        conn.accept(name);
    }

    public static void main(String[] args) {

        method("赵丽颖",(String name)->{
            String reName=new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
