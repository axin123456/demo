package com.orbyun.observer;

/**
 * @author chenjixin
 * @date 2019-11-26 15:37
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
