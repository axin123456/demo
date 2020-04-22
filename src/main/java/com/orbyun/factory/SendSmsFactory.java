package com.orbyun.factory;

/**
 * @author chenjixin
 * @date 2019-11-26 13:16
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
