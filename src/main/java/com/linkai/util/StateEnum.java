package com.linkai.util;

/**
 * Created by K Lin
 * on 2017/11/23.
 * at 13:14
 * description : offical_website
 */
public enum StateEnum {
    OK(1),          //一切正常
    SERVER_ERROR(5000);                    // 后台服务器发生未知错误
    private int state;

    StateEnum(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
