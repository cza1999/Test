package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();
      map.put("b", 97);
      map.put("c", 98);
      map.put("d", 99);
      Set<Map.Entry<String,Integer>> set=map.entrySet();
      Iterator<Map.Entry<String,Integer>> it=set.iterator();
      while(it.hasNext()){
          Map.Entry<String,Integer> entry=it.next();
          String key=entry.getKey();
          Integer value=entry.getValue();
          System.out.println(key+" "+value);
      }
        System.out.println("================");
        for (Map.Entry<String,Integer> entry:set
             ) {
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }



}
