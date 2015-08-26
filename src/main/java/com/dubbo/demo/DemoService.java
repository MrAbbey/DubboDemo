package com.dubbo.demo;

import com.dubbo.demo.model.User;

import java.util.List;

/**
 * Created by pl on 2015/8/14.
 */
public interface DemoService {
    String sayHello(String name);
    List<User> listUsers();
}
