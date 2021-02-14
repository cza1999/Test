package Lambda;
/*
使用L ambda优化日志案例Lambda的特点:延迟加载
        L ambda的使用前提,必须存在函数式接口


        使用L ambda表达式作为参数传递,仅仅是把参数传递到showLog方法中只有满足条件,日志的等级是1级
才会调用接口MessageBuiLder中的方法buiLderMessage才会进行字符串的拼接
如果条件不满足,白志的等级不是1级
那么NessageBuiLder接口中的方法buiLderNessage也不会执行所以拼接字符串的代码也不会执行
所以不会存在性能的浪费

*/

public class LogerEst {
    public  static void showLong(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.buildMessage());
        }
    }
    public static void main(String[] args) {
        String msg1 = "he";
        String msg2 = "ll";
        String msg3 = "o";
        //调用showLog方法,参数NessageBuilder是一个函数式接口,
        // 所以可以传递Lambda表达式
        showLong(1,()->msg1+msg2+msg3);
    }

}
