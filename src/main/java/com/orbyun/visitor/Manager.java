package com.orbyun.visitor;

/**
 * @author chenjixin
 * @date 2019-11-25 16:19
 */
public class Manager extends Employee {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    private String performance;



}


