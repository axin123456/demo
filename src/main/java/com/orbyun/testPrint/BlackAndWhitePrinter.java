package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:13
 */
public  class BlackAndWhitePrinter extends AbstractPrinter {
    public  BlackAndWhitePrinter(){
        System.out.println("构造器");
    }

    @Override
    public void print(Paper paper) {
        this.showPaperIntroduce(paper.viewIntroduce());
        System.out.println("这是" + paper.getType() + "黑白打印---");
    }
}
