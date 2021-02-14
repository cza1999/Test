package HashSet;
/*HashSet存储自定义类型元素set集合报错元素唯—:
        存储的元素(String,Integer, . . .student , Person.. .),
        必须重写hashcode方法和equal
        要求:
        同名同年龄的人,视为同一个人,只能存储一次*/

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<SetPerson> set=new HashSet<>();
        SetPerson p1=new SetPerson("小美女",18);
        SetPerson p2=new SetPerson("小美",19);
        SetPerson p3=new SetPerson("小美",18);
        SetPerson p4=new SetPerson("小美女",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);

    }
}
