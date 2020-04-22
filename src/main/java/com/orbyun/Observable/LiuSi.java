package com.orbyun.Observable;

/**
 * @author chenjixin
 * @date 2019-11-26 09:23
 */
public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子正在活动,向老板汇报");
        happy(context);
        System.out.println("王四,真真的高兴死了");
    }

    private void happy(String context) {
        System.out.println("王四:因为"+context+"一切我高兴啊");
    }
}
