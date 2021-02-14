package Net;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServe {
    public static void main(String[] args) throws IOException {
        ServerSocket serve=new ServerSocket(8888);
        Socket socket=serve.accept();
        InputStream is=socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os=socket.getOutputStream();
        os.write("收到，谢谢".getBytes());
        socket.close();
        serve.close();
    }
}
