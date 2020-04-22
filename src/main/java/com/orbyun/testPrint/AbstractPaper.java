package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 16:59
 */
public abstract class AbstractPaper implements Paper {

    protected String type;
    private AbstractPaper() {
    }
    protected AbstractPaper(String type) {
        this.type = type;
    }
    @Override
    public String getType() {
        return this.type;
    }

}
