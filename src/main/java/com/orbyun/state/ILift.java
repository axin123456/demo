package com.orbyun.state;

/**
 * @author chenjixin
 * @date 2019-11-25 15:11
 */
public interface ILift {
    public final static int OPENING_STATE = 1;
    public final static int CLOSEING_STATE = 2;
    public final static int RUNNING_STATE = 3;
    public final static int STOPPING_STATE = 4;

    public void setState(int state);

    public void open();

    public void close();

    public void run();

    public void stop();


}
