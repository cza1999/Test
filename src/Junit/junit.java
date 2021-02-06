package Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class junit {
    /*初始化方法:
    用于资源申请,所有测试方法在执行之前都会先执行该方法
*/
    @Before
    public  void init(){
        System.out.println("init-----");
    }
   /* 释放资源方法:
    在所有测试方法执行完后,都会自动执行该方法
*/
    @After
    public void closse(){
        System.out.println("释放资源");
    }
    @Test
    public void testAdd(){
        Calculator ca = new Calculator();
        int c=ca.add(3,4);
        System.out.println(c);
        Assert.assertEquals(7,c);

    }
}
