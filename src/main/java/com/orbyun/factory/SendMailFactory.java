package com.orbyun.factory;

/**
 * @author chenjixin
 * @date 2019-11-26 13:15
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
