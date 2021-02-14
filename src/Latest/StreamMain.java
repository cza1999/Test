package Latest;
/*
现在有两个ArrayList集合存储队伍当中的多个成员姓名，
        要求使用传统方法执行若干操作步骤:
        1.第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
        2.第一个队伍筛选之后只要前3个人;存储到一个新集合中。
        3.第二个队伍只要姓张的成员姓名∶存储到一个新集合中。
        4.第二个队伍筛选之后不要前2个人;存储到一个新集合中。
        5.将两个队伍合并为一个队伍;存储到一个新集夤中。
        6.根据姓名创建Person对象;存储到一个新集合中。
        7.打印整个队伍的Person对象信息。
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        one.add("迪丽热巴1");
        one.add("songyuanqiao1");
        one.add("苏星河1");
        one.add("石中玉1");
        one.add("老子1");
        one.add("庄子1");
        Stream<String> onestream = one.stream().filter(name ->
                name.length() == 3).limit(2);



        ArrayList<String> two=new ArrayList<>();
        two.add("迪丽热巴2");
        for (String s : Arrays.asList("songyuanqiao2", "苏星河2", "苏星河3", "苏星河4", "苏星河5", "石中玉2", "老子2", "庄子2")) {
            two.add(s);
        }
        Stream<String> twostream = two.stream().filter(name ->
                name.startsWith("苏")).skip(2);
        Stream.concat(onestream,twostream).map(name->
                new Personer(name)).forEach(p->
                System.out.println(p));
    }
}
