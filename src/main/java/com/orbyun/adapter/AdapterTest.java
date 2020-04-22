package com.orbyun.adapter;

/**
 * @author chenjixin
 * @date 2019-11-26 13:48
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
