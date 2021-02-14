package Stream;
/*使用Stream流的方式,遍历集合,对集合中的数据进行过滤
        Stream流是JDK1.8之后出现的
        关注的是做什么,而不是怎么做*/

import java.util.ArrayList;
import java.util.List;

public class DemoListStream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aw");
        list.add("xwe");
        list.add("c");
        list.add("vc");
        list.add("b");
        list.add("n");
        list.stream()
                .filter(nam->nam.startsWith("a"))
                .filter(nam->nam.length()==2)
                .forEach(nam-> System.out.println(nam));
    }
}
