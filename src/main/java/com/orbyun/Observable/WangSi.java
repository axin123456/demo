package com.orbyun.Observable;

/**
 * @author chenjixin
 * @date 2019-11-26 09:19
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子正在活动,向老板汇报");
        cry(context);
        System.out.println("王四,真真的哭死了");
    }

    private void cry(String context) {
        System.out.println("王四:因为"+context+"一切我悲哀呀");
    }
}
