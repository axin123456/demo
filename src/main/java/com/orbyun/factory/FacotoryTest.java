package com.orbyun.factory;

/**
 * @author chenjixin
 * @date 2019-11-26 13:17
 */
public class FacotoryTest {
    public static void main(String[] args) {
        Provider provider=new SendMailFactory();
        Sender sender =provider.produce();
        sender.send();
    }
}
