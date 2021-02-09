package BufferChar;

import java.io.*;

public class BufferCharReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(
                new FileReader("src/BufferChar/bc.txt"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
