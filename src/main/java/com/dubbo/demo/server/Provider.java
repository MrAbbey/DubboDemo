package com.dubbo.demo.server;

        import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pl on 2015/8/14.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
