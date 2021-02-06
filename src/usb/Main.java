package usb;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        USB usbMouse=new Mouse();//多态，向上转型

        computer.useDevice(usbMouse);
        Keyboard keyboard=new Keyboard();
        computer.useDevice(keyboard);
        computer.powerOff();
    }
}
