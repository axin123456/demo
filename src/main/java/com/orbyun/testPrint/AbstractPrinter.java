package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:02
 */
public abstract class AbstractPrinter implements Printer {

    public AbstractPrinter(){
        System.out.println("父类构造器");
    }


    @Override
    public void showPaperIntroduce(String paperDesc) {
        System.out.println("打印机自动报备当前使用纸张:");
        System.out.println(paperDesc);
    }
}
