package getClass3Methods;
/*
获取class对象的方式:
        1. class.forName("全类名"):将字节码文件加载进内存，返回class对象
        2．类名.class :通过类名的属性class获取
        3，对象.getclass() : getclass()方法在object类中定义着。
*/

public class getClass {
    public static void main(String[] args) throws  Exception{
//        1. class.forName("全类名")
        Class  cls=Class.forName("getClass3Methods.person");
        System.out.println(cls);
//        2．类名.class :
        Class cls2=person.class;
        System.out.println(cls2);
//        3，对象.getclass()
        person p = new person();
        Class cls3=p.getClass();
        System.out.println(cls3);

        System.out.println(cls==cls2);
        System.out.println(cls==cls3);
        System.out.println(cls3==cls2);
    }
}
