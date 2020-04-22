package com.orbyun.factory;

/**
 * @author chenjixin
 * @date 2019-11-26 13:12
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender");
    }
}
