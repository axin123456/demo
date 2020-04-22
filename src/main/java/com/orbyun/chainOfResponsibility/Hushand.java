package com.orbyun.chainOfResponsibility;

/**
 * @author chenjixin
 * @date 2019-11-25 18:01
 */
public class Hushand extends Handler {

    public Hushand() {
        super(2);
    }

    @Override
    public void respose(IWomen women) {
        System.out.println("妻子的请示是:" + women.getRequest());
        System.out.println("丈夫的回答是: 同意");
    }
}
