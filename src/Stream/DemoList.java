package Stream;
//传统方式遍历筛选
import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aw");
        list.add("xwe");
        list.add("c");
        list.add("vc");
        list.add("b");
        list.add("n");

        List<String>list1=new ArrayList<>();
        for (String s:list
             ) {
            if (s.startsWith("a")){
                list1.add(s);
            }
        }
        List<String>list2=new ArrayList<>();
        for (String s:list1
        ) {
            if (s.length()==2){
                list2.add(s);
            }
        }
        System.out.println(list2);

    }
}
