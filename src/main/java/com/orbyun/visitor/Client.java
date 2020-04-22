package com.orbyun.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjixin
 * @date 2019-11-25 16:51
 */
public class Client {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());

        }
    }

    public static List<Employee> mockEmployee(){
        List<Employee> list = new ArrayList<Employee>();

        CommonEmployee zhangsan=new CommonEmployee();
        zhangsan.setJob("编写java程序");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        list.add(zhangsan);

        CommonEmployee lisi=new CommonEmployee();
        lisi.setJob("页面美工");
        lisi.setSex(Employee.FEMALE);
        lisi.setSalary(1900);
        lisi.setName("李四");
        list.add(lisi);


        Manager wangwu=new Manager();
        wangwu.setName("王五");
        wangwu.setPerformance("基本是负值");
        wangwu.setSalary(20000);
        wangwu.setSex(Employee.MALE);
        list.add(wangwu);


        return list;


    }
}
