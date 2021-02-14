package Lambda;
/*Consumer接口的黑认方法andThen
        作用:需要两个consumer接口,可以把两个Consumer接口组合到一起,
        在对数据进行消费
        例如;
        Consumer<String> con1;
        Consumer<String> con2;
        String s = "helLo"";" +
        "con1.accept(s);
        con2.accept(s);
        连接两个consumer接口再进行消费
coni.andThen ( con2).accept(s);谁写前边谁先消费
*/

import java.util.Locale;
import java.util.function.Consumer;
//andThen
public class DemoConsumer1 {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {

       /* con1.accept(s);
        con2.accept(s);*/
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {

        method("Hello",
                (t)->{
                    System.out.println(t.toUpperCase(Locale.ROOT));

                },(t)->{
                    System.out.println(t.toLowerCase());

                });
    }
}
