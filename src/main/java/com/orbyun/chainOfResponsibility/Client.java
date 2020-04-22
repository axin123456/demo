package com.orbyun.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author chenjixin
 * @date 2019-11-25 18:22
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "我要去逛街"));
        }

        Handler father = new Father();
        Handler hushand = new Hushand();
        Handler son = new Son();

        father.setNextHandler(hushand);
        hushand.setNextHandler(son);
        for (IWomen iWomen : list) {
            father.respose(iWomen);
        }
    }
}
