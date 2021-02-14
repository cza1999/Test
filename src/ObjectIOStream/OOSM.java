package ObjectIOStream;
/*
java.io.0bjectoutputstream extends outputStream
        对象的序列化流
        作用:把对象以流的方式写入到文件中保存
        构造方法:
 objectoutputStream(outputstream out）创建写入指定outputStream的objectOutputStream。
        参数:
        OutputStream out:字节输出流
        特有的成员方法:
void write0bject(0bject obj）将指定的对象写入、 objectoutputstream
        使用步骤;
        1.创建objectoutputStream对象,构造方法中传递字节输出流
2.使用objectoutputstream对象中的方法writeobject,把对象写入到文件中
        3.释放资源
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSM {
    public static void main(String[] args)throws IOException {

        ObjectOutputStream oos=new ObjectOutputStream(
        new FileOutputStream("src/ObjectIOStream/oo.txt"));
        oos.writeObject(new OOS("1234",97));
        oos.close();


    }
}
/*
序列化和反序列化的时候,会抛出NotSerializableException没有序列化异常
        类通过实现 java.io.Serializable接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口,就会给类添加一个标记当我们进行序列化和反序列化的时候,就会检测类上是否有这个标记
        有:就可以序列化和反序列化
        没有:就会批出NotSerializabLeException异常

*/
