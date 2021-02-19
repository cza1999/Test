package Net.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

class Receiver
{
    public void receive()
    {
        byte [] data=new byte[1024];//数据缓存区
        int port=6666;//多播端口
        InetAddress group=null;
        MulticastSocket ms=null;

        try
        {
            group=InetAddress.getByName("224.1.1.1");//创建多播地址
            ms=new MulticastSocket(port);//创建多播套接字
            ms.joinGroup(group);//将套接字加入多播地址
            DatagramPacket dp = new DatagramPacket(data, data.length,group, port);//创建待接收的数据报
            ms.receive(dp);//接收数据报
            String msg=new String(dp.getData(),0,dp.getLength());
            System.out.println("接收的广播数据为："+msg);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            ms.close();//关闭套接字
        }
    }
}

public class ReceiverTest
{
    public static void main(String[] args)
    {
        new Receiver().receive();
    }
}
