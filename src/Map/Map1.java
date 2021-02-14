package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
public V put(K key,v value):把指定的键与指定的值添加到Map集合中。
        返回值:v
        存储键值对的时候, key不重复,返回值v是null
        存储键值对的时候, key重复,会使用新的value替换map中重复的value,返回被替换的value值
*/

public class Map1 {
    public static void main(String[] args) {
        show1();
    }
    public static void show1(){
        Map<String,String> map =new HashMap<>();
       /* String v1=map.put("a","b");
        System.out.println("v1:"+v1);
        String v11=map.remove("a");
        System.out.println("v1:"+v11);

        System.out.println(map);*/
        String v2=map.put("b","97");
        String v3=map.put("c","98");
        String v4=map.put("d","99");
       /* System.out.println("v2:"+v2);
        System.out.println(map);*/
        Set<String> keys=map.keySet();

        Iterator<String> it=keys.iterator();
//        System.out.println("it类型："+ it.getClass().getSimpleName());
        while(it.hasNext()){
            String key=it.next();
//            System.out.println("key类型："+ key.getClass().getSimpleName());

            String value=map.get(key);
            System.out.println("key:"+key);
            System.out.println("value:"+value);
        }
        System.out.println("key1:"+keys);
//        System.out.println("keys类型："+ keys.getClass().getSimpleName());

        System.out.println("value1:"+(String) map.get(keys));
    }
}
