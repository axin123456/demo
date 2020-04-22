package com.orbyun.observer;

/**
 * @author chenjixin
 * @date 2019-11-26 15:24
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received");
    }
}
