package com.orbyun.Observable;

/**
 * @author chenjixin
 * @date 2019-11-26 09:13
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子正在活动,向老板汇报");
        reportToQiShiHuang(context);
        System.out.println("汇报完毕,老板赏给他东西");
    }

    private void reportToQiShiHuang(String context) {
        System.out.println("李斯:报告韩非子有活动"+context);
    }
}
