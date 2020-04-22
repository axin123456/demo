package com.orbyun.observer;

/**
 * @author chenjixin
 * @date 2019-11-26 15:35
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
