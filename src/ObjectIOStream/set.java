package ObjectIOStream;
/*当我们想在文件中保存多个对象的时候可以把多个对象存储到一个集合中
对集合进序列化和反序列化
        1-定义一个存储Person对象的Arraylist集合
        2.往ArrayList集合中存储Person对象
        3.创建一个序列化流0bjectoutputStream对象
        4.使用objectoutputstream对象中的方法writeobject,
        对集合进行序列化
        5.创建一个反序列化objectInputStream对象
        6.使用objectInputStream对象中的方法readobject
        读取文件中保存的集合
        7.把object类型的集合转换为ArrayList类型
        8.遍历ArrayList集合
        9.释放资澜*/


import java.io.*;
import java.util.ArrayList;

public class set {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<OOS>list=new ArrayList<>();
        list.add(new OOS("张三",18));
        list.add(new OOS("张四",19));
        list.add(new OOS("张五",20));
        list.add(new OOS("张六",21));
        ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream("src/ObjectIOStream/oo.txt"));
        oos.writeObject(list);

        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream("src/ObjectIOStream/oo.txt")
        );
        Object o=ois.readObject();
//        7.把object类型的集合转换为ArrayList类型
        ArrayList<OOS>list2=(ArrayList<OOS>)o;
        for (OOS os:list2
             ) {
            System.out.println(os);
            System.out.println("---------------------");
            System.out.println(os.getName()+" "+os.getAge());
            System.out.println("---------------------");
            System.out.println(os.toString());
            System.out.println("============================");

        }
        ois.close();
        oos.close();

    }
}
