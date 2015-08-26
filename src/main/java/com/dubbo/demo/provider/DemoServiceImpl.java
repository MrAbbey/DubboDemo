package com.dubbo.demo.provider;

import com.dubbo.demo.DemoService;
import com.dubbo.demo.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pl on 2015/8/14.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public List<User> listUsers() {
        User user = new User("aaaa","男",22);
        User user2 = new User("bbbb","男",23);
        User user3 = new User("cccc","男",45);
        User user4 = new User("dddd","男",33);
        User user5 = new User("eeee","男",21);
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        return users;
    }
}
