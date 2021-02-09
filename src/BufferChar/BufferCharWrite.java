package BufferChar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferCharWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(
                new FileWriter("src/BufferChar/bc.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("窗子博客1");
//            bw.write("\r\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();


    }
}
