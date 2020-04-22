package com.orbyun.visitor;

/**
 * @author chenjixin
 * @date 2019-11-25 16:18
 */
public class CommonEmployee extends Employee {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
