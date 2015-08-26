package com.dubbo.client;

import com.dubbo.demo.DemoService;
import com.dubbo.demo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by pl on 2015/8/26.
 */
    public class Consumer {

        public static void main(String[] args) throws Exception {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
            context.start();

            DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
            String hello = demoService.sayHello("world"); // 执行远程方法
            System.out.println( hello ); // 显示调用结果
            List<User> users = demoService.listUsers();
            for(User user: users){
                System.out.println("name="+user.getName()+",sex="+user.getSex()+",age="+user.getAge());
            }
        }
    }
