package com.orbyun.testConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println(".................ioc容器初始化开始...........");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
        System.out.println(".................ioc容器初始化结束...........");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = context.getBean(definitionName);
            System.out.println("bean name"+definitionName+" bean tyepe"+bean.getClass());
        }
    }
}
