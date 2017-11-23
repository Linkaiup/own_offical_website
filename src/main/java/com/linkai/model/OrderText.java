package com.linkai.model;

import java.io.Serializable;

/**
 * Created by K Lin
 * on 2017/11/22.
 * at 17:43
 * description : offical_website
 */
public class OrderText implements Serializable{
    private static final long serialVersionUID = 1L;

    private String customerName;
    private String phone;
    private String address;
    private float estimateValue;


    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getEstimateValue() {
        return estimateValue;
    }

    public void setEstimateValue(float estimateValue) {
        this.estimateValue = estimateValue;
    }

    public OrderText(String customerName, String phone, String address, float estimateValue) {
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.estimateValue = estimateValue;
    }

    @Override
    public String toString() {
        return "OrderText{" +
                "customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", estimateValue=" + estimateValue +
                '}';
    }
}
