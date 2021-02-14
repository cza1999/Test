package Lambda;
/*练习:
字符串数组当中存有多条信息，请按照格式“姓名:XX。性别:xx。""
的格式将信息打印出来。要求将打印姓名的动作作为第一个Consumer接口
的Lambda实例，
将打印性别的动作作为第二个consumer接口的Lambda实例，
将两个Consumer接口按照顺序"拼接”到一起。

*/

import java.util.Locale;
import java.util.function.Consumer;

//andThen
public class DemoConsumer2 {
    public static void pringInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {

        for (String mesage:arr
             ) {
            con1.andThen(con2).accept(mesage);
        }

    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","赵丽颖,女"};

        pringInfo(arr,
                (message)->{
                    String name=message.split(",")[0];
                    System.out.print("姓名:"+name+" ");

                },(message)->{
                    String sex=message.split(",")[1];
                    System.out.println("性别:"+sex);

                });
    }
}
