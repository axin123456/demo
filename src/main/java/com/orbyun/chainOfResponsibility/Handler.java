package com.orbyun.chainOfResponsibility;

import java.util.HashMap;

/**
 * @author chenjixin
 * @date 2019-11-25 17:28
 */
public abstract class Handler {

    private int level = 0;
    private Handler nextHandler;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void HandlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.respose(women);
        } else {
            if (this.nextHandler != null) {
                nextHandler.HandlerMessage(women);
            } else {
                System.out.println("没有地方可以请示");
            }
        }
    }

    public void setNextHandler(Handler _handler) {
        this.nextHandler = _handler;

    }

    public abstract void respose(IWomen women);
}
