package com.orbyun.Observable;

import java.util.ArrayList;

/**
 * @author chenjixin
 * @date 2019-11-26 09:04
 */
public class HanFeiZi implements Observable {

    private ArrayList<Observer> observableList = new ArrayList<Observer>();
    @Override
    public void addObserver(Observer observer) {
        observableList.add(observer);
    }

    @Override
    public void deteleObserver(Observer observer) {
        observableList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observableList) {
            observer.update(context);
        }
    }

    public void haveBreakfast(){
        System.out.println("韩非子要吃饭啦");
        notifyObserver("韩非子正在吃饭");
    }

    public void haveFun(){
        System.out.println("韩非子要娱乐了");
        notifyObserver("韩非子正在娱乐");
    }
}
