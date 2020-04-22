package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:15
 */
public  class ColorPrinter extends AbstractPrinter {

    @Override
    public void print(Paper paper) {
        this.showPaperIntroduce(paper.viewIntroduce());
        System.out.println("这是" + paper.getType() + "彩色打印---");
    }
}
