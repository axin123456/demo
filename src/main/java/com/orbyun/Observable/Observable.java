package com.orbyun.Observable;

public interface Observable {
    //增加一个观察者
    public void addObserver(Observer observer);
    //删除一个观察者
    public void deteleObserver(Observer observer);
    //修改一个观察者
    public void notifyObserver(String context);
}
