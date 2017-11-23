package com.linkai.dto;

import com.linkai.util.StateEnum;

/**
 * Created by K Lin
 * on 2017/11/23.
 * at 13:09
 * description : offical_website
 */
public class RequestResult<T> {
    private int state;  //状态码
    private T data;     //返回的数据

    public RequestResult(StateEnum stateEnum, T data) {
        this.data = data;
        this.state = stateEnum.getState();
    }
    public RequestResult(){}

    public RequestResult(StateEnum stateEnum) {
        this.state = stateEnum.getState();
    }

    public RequestResult(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestResult{" +
                "state=" + state +
                ", data=" + data +
                '}';
    }
}
