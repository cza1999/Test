package Properties;
/*
(一)	可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        void store(outputStream out,String comments)
        void store (writer writer, String comments)
        参数:
        OutputStream out:字节输出流,不能与入中文
        writer writer:字符输出流,可以写中文
        String comments:注释,用来解释说明保存的文件是做什么用的不能使用中文,会产生乱码,默认是unicode编码,一般使用""空字符串
        使用步骤:
        1.创建Properties集合对象,添加数据
        2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
        3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
        4.释放资澜
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Store {
    public static void main(String[] args) throws IOException {
        show2();
    }


    private static void show2() throws IOException{
        Properties prop = new Properties();
        //使用setproperty往集合中添加数据

        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "158");
        prop.setProperty("古力娜扎", "178");

        FileWriter fw=new FileWriter(
    "D:\\daima\\idea\\test\\src\\Properties\\xx.txt");
        prop.store(fw,"save data");
        fw.close();
    }
}
