package com.orbyun.chainOfResponsibility;

/**
 * @author chenjixin
 * @date 2019-11-25 17:34
 */
public class Women implements IWomen {

    private int type = 0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;

        switch (this.type) {
            case 1:
                this.request = "女儿的请求" + _request;
                break;
            case 2:
                this.request = "妻子的请求" + _request;
                break;
            case 3:
                this.request = "母亲的请求" + _request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }

}
