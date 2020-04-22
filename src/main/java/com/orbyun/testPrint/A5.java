package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:06
 */
public class A5 extends AbstractPaper {
    protected A5(String type) {
        super(type);
    }

    @Override
    public String viewIntroduce() {
        return this.type + ":148×210";
    }
}
