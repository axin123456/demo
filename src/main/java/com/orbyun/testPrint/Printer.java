package com.orbyun.testPrint;

public interface Printer {

    //打印机能在纸上打印
    public void print(Paper paper);
    //打印机报备纸张信息
    public void showPaperIntroduce(String paperDesc);
}
