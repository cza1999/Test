package ObjectIOStream;
/*
java.io.0bjectInputstream extends InputStream:
        对象的反序列化流
        作用:把文件中保存的对象,以流的方式读取出来使用
        构造方法:
        objectInputStream(InputStream in）创建从指定InputStream 读取的 objectinputStream
        参数;
        InputStream in :字节输入流
        特有的成员方法:
        object readobject()从0bjectInputStream读取对象。
        使用步骤:
        1.创建objectInputStream对象,构造方法中传递字节输入流
        2.使用objectinputstream对家中的方法readobject读取保存对象的文件
        3.释放资源
        4.使用读取出来的对象(打印)
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISM {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(
                new FileInputStream("src/ObjectIOStream/oo.txt")
        );

        Object o=ois.readObject();
        ois.close();
        System.out.println(o);
        OOS oos=(OOS)o;
        System.out.println(oos.toString());
        System.out.println(oos.getName()+" "+oos.getAge());
    }
}
/*
    readobject方法声明抛出了CLassNotFoundException(class文件找不到异常)
    当不存在对象的cLass文件时批出此异常
反序列化的前提:
        1.类必须实现Serializable
        2.必须存在类对应的ctass文件
*/
