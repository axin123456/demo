package com.orbyun.visitor;

/**
 * @author chenjixin
 * @date 2019-11-25 16:16
 */
public interface IVisitor {
    public void visit(CommonEmployee commomEmplee);

    public void visit(Manager manager);
}
