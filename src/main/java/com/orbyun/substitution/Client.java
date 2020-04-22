package com.orbyun.substitution;

import java.util.HashMap;

/**
 * @author chenjixin
 * @date 2019-11-25 14:07
 */
public class Client {
    public static void main(String[] args) {
        //Father father=new Father();
        Son son=new Son();
        HashMap map = new HashMap();
        son.doSomething(map);
    }
}
