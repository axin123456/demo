package com.orbyun.testPrint;

/**
 * @author chenjixin
 * @date 2019-11-20 17:16
 */
public class DuoTai {
    public static void main(String[] args) {
        Printer printer = new BlackAndWhitePrinter();
        //BlackAndWhitePrinter blackAndWhitePrinter=new BlackAndWhitePrinter();
        printer.print(new A5("硬A5纸"));
        printer=new ColorPrinter();
        printer.print(new A4("软A4纸"));
    }
}
