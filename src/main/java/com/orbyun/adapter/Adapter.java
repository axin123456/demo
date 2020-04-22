package com.orbyun.adapter;

/**
 * @author chenjixin
 * @date 2019-11-26 13:47
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method");
    }
}
