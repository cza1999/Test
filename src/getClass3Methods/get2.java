package getClass3Methods;

import java.lang.reflect.Constructor;

//二．获取构造方法们
public class get2 {
    public static void main(String[] args) throws Exception {
        Class personClass=person.class;
//     1.   *constructor<?>[ ]getconstructors()
        Constructor con =personClass.getConstructor(String.class,int.class,int.class);
        System.out.println(con);
//        全参创建对象
        Object person =con.newInstance("张三",59,90);
        System.out.println(person);

//        空参创建对象
        Constructor con2 =personClass.getConstructor();
        Object o=con2.newInstance();
        System.out.println(o);

    }
}
