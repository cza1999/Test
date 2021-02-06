package getClass3Methods;

import java.lang.reflect.Method;

public class get3 {
    public static void main(String[] args) throws Exception{
        Class perClass=person.class;
//        1.*Method[ ] getMethods()
//            无参
        Method eatMethod=perClass.getMethod("eat");
        person p=new person();
        eatMethod.invoke(p);
        Method eat2Method =perClass.getMethod("eat2",String.class);
       eat2Method.invoke(p,"饭");

        System.out.println("=====================");
//        获取所有public修饰的方法
        Method[] methods=perClass.getMethods();
        for(Method md:methods){
            System.out.println(md);
            String name=md.getName();
            System.out.println(name);
        }



    }
}
