package com.orbyun.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author chenjixin
 * @date 2019-11-26 15:29
 */
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<Observer>();

    public void add(Observer observer) {
        vector.add(observer);
    }

    public void del(Observer observer) {
        vector.remove(observer);
    }

    public void notifyObservers() {
        Enumeration<Observer> enmo = vector.elements();
        while (enmo.hasMoreElements()) {
            enmo.nextElement().update();
        }
    }
}
