package Lambda;
//日志案例
/*
发现以下代码存在的一些性能浪费的问题
调用showLog方法,传递的第二个参数是一个拼接后的字符串先把字符串拼接好,
然后在调用showLog方法
        showLog方法中如果传递的日志等级不是1级那么就不会是如此
        拼接后的字符串
        所以感觉字符串就白拼接了,存在了浪费
*/

public class Logger {
    public  static void showLong(int level,String message){
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="he";
        String msg2="ll";
        String msg3="o";
        showLong(1,msg1+msg2+msg3);
    }

}
