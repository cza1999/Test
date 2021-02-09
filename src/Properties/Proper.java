package Properties;
/*
java.util .Properties集合extends Hashtable<k,v> implements Map<k , v>
Properties类表示了一个持久的属性集。Properties可保存在流中或从流中加戟。Properties集合是一个唯一和I0流相结合的集合
可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
可以使用Properties集合中的方法Load,把硬盘中保存的文件(键值对),读取到集合中使用，属性列表中每个键及其对应值都是一个字符串。
properties集合是一个双列集合,key和vaLue默认都是字符串
使用Properties集合存储数据,遍历取出Properties集合中的数据

 Properties集合有一些操作字符串的特有方法
0bject setProperty (String key,String value）调用Hashtable 的方法put。
string getproperty(String key)通过key找到value值,此方法相当于Map集合中的get(key)方法
Set<String> stringPropertyNames(）返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Hap集合中的keyset方法
*/

import java.util.Properties;
import java.util.Set;

public class Proper {
    public static void main(String[] args) {
        show1();
    }
    private  static  void show1(){
        Properties prop=new Properties();
        //使用setproperty往集合中添加数据

        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","158");
        prop.setProperty("古力娜扎","178");

        Set<String>set=prop.stringPropertyNames();
        //遍历set集合,取出Properties集合的每一个键

        for (String key:set
             ) {
            //使用getProperty方法通过key获取value

            String value=prop.getProperty(key);
            System.out.println(key+"="+value);

        }
    }

}
