package com.orbyun.LawOfDemeter;

import java.util.Random;

/**
 * @author chenjixin
 * @date 2019-11-25 11:26
 */
public class Wizard {

    private Random random = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("第一个执行的方法");
        return random.nextInt(100);
    }

    private int second() {
        System.out.println("第二个执行的方法");
        return random.nextInt(100);
    }

    private int third() {
        System.out.println("第三个执行的方法");
        return random.nextInt(100);
    }

    public void installWizard(){
        int first=this.first();
        if(first>50){
            int second=this.second();
            if(second>50){
                int third=this.third();
                if(third>50){
                    this.first();
                }
            }
        }
    }
}
