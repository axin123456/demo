package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:04
 */
public class A4 extends AbstractPaper {
    protected A4(String type) {
        super(type);
    }

    @Override
    public String viewIntroduce() {
       return this.type + ":210×297";
    }
}
