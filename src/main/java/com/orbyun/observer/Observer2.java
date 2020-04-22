package com.orbyun.observer;

/**
 * @author chenjixin
 * @date 2019-11-26 15:25
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer has received");
    }
}
