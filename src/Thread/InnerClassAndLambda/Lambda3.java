package Thread.InnerClassAndLambda;
/*
Lombdo表达式有参数有返回值的练习霄求;
        给定一个计算器caLcuLotor接口，内含抽象方法caLc
        可以将两个int数字相加得到和值使用Lambdo的标准格式
        调用invokecalc万法,完成120和130的相加计算
*/

public class Lambda3 {
    public static void main(String[] args) {
       /* invokeCalc(10, 20, new Calcuator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });*/
//        使用lambda

        invokeCalc(120,130,(int a,int b)->{
            return a+b;
        });
//        省略格式
        invokeCalc(12,13,(a,b)->a+b);



    }
    public static void invokeCalc(int a,int b,Calcuator c){
        int sum= c.calc(a,b);
        System.out.println(sum);
    }
}
