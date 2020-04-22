package com.orbyun.chainOfResponsibility;

/**
 * @author chenjixin
 * @date 2019-11-25 18:03
 */
public class Son extends Handler {

    public Son() {
        super(3);
    }

    @Override
    public void respose(IWomen women) {
        System.out.println("母亲的请示是: " + women.getRequest());
        System.out.println("儿子的回答是 同意");
    }
}
