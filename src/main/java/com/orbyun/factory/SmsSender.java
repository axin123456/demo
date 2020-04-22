package com.orbyun.factory;

/**
 * @author chenjixin
 * @date 2019-11-26 13:13
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
