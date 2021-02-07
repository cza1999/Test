package Thread.Thread1;
/*
public static void sleep(Long miLLis):
        使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行)。
        毫秒数结束之后,线程继续执行
*/

public class sleepThread {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
