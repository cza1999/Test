package usb;


public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
//    使用usb设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();
        usb.close();
    }
}

