package com.orbyun.chainOfResponsibility;

/**
 * @author chenjixin
 * @date 2019-11-25 17:59
 */
public class Father extends Handler {

    public Father() {
        super(1);
    }

    @Override
    public void respose(IWomen women) {
        System.out.println("女儿的请示:" + women.getRequest());
        System.out.println("父亲的回答是:同意");
    }
}
