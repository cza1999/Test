package Net.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

class BroadCast
{
    public void send()
    {
        String msg="Hello,This is Broadcast Message";//多播的内容
        int port=6666;//多播端口
        InetAddress group=null;
        MulticastSocket ms=null;

        try
        {
            group= InetAddress.getByName("224.1.1.1");//创建多播地址
            ms=new MulticastSocket(port);//创建多播套接字
            ms.joinGroup(group);//将套接字加入多播地址
            ms.setTimeToLive(1);//设置数据报发送范围为本地
            DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),group,port);//创建待发送的数据报
            ms.send(dp);//发送数据报
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

public class BroadcastTest
{
    public static void main(String[] args)
    {
        new BroadCast().send();
    }
}