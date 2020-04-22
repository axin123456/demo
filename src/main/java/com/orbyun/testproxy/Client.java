package com.orbyun.testproxy;

import com.orbyun.dynamicproxy.UserManager;
import com.orbyun.dynamicproxy.UserManagerImpl;

public class Client {
    public static void main(String[] args) {
        UserManager userManager=  new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("1111","张三");
    }


}
