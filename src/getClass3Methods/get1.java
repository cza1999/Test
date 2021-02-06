package getClass3Methods;

import java.lang.reflect.Field;

public class get1 {
    public static void main(String[] args) throws  Exception{
        Class personClass=person.class;
   /*     一。获取成员变们
*/
//         1*Field[ ] getFields()
        Field[] fields =personClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("--------------------");
//       2 *Field getField(string name)
        Field nu=personClass.getField("num");
        System.out.println(nu);
//        获取成员变量的值
        person p=new person();
        Object value =nu.get(p);
        System.out.println(value);
//        设置成员变量的值
        nu.set(p,56);
        System.out.println(p);
        System.out.println("========================");
//        3 *Field[ ] getDeclaredFields()获取所有的成员变量不考虑修饰符
        Field[] d=personClass.getDeclaredFields();
        for( Field i:d){
            System.out.println(i);
        }
//      4  *Field getDeclaredField(string name)
        Field de=personClass.getDeclaredField("age");
//        私有权限不能访问，忽略安全检查
        de.setAccessible(true);//暴力反射
        Object value2=de.get(p);
        System.out.println(value2);
    }
}
