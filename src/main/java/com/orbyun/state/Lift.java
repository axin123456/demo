package com.orbyun.state;

/**
 * @author chenjixin
 * @date 2019-11-25 15:16
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.openWithoutlogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutlogic();
                this.setState(OPENING_STATE);
                break;

        }
    }

    private void openWithoutlogic() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutlogic();
                this.setState(CLOSEING_STATE);
                break;
            case CLOSEING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    private void closeWithoutlogic() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.runWithoutlogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithoutlogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    private void runWithoutlogic() {
        System.out.println("电梯运行中");
    }

    @Override
    public void stop() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.stopWithoutlogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutlogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    private void stopWithoutlogic() {
        System.out.println("电梯停止中");
    }
}
