package com.orbyun.state;

/**
 * @author chenjixin
 * @date 2019-11-25 15:41
 */
public class Client {
    public static void main(String[] args) {
        ILift iLift=new Lift();
        iLift.setState(ILift.CLOSEING_STATE);
        iLift.open();
        iLift.close();
        iLift.run();
        iLift.stop();
    }
}
