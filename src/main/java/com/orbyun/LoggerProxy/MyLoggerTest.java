package com.orbyun.LoggerProxy;

import java.lang.reflect.Proxy;

public class MyLoggerTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /** 实例化真实项目中业务类 **/
        BusinessClassService businessClassService = new BusinessClassServiceImpl();
        /** 日志类的handler **/
        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);
        /** 获得代理类对象 **/
        BusinessClassService businessClass = (BusinessClassService) Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(),
                businessClassService.getClass().getInterfaces(),
                myLoggerHandler);
        /** 执行代理类方法 **/
        businessClass.doSomeThing();






        System.out.println(businessClassService.getClass());
        System.out.println(MyLoggerTest.class);

        Class aClass = Class.forName("com.orbyun.LoggerProxy.BusinessClassServiceImpl");

        Object o = aClass.newInstance();


        System.out.println(o);
    }
}
