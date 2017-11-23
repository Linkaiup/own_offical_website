package com.linkai.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by K Lin
 * on 2017/11/22.
 * at 17:26
 * description : offical_website
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private int productId;
    private String head;
    private String body;
    private Calendar buildTime;
    private String picturePath;


    public String getPicturePath() {

        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Calendar getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Calendar buildTime) {
        this.buildTime = buildTime;
    }

    public Product(int productId, String head, String body, Calendar buildTime, String picturePath) {
        this.productId = productId;
        this.head = head;
        this.body = body;
        this.buildTime = buildTime;
        this.picturePath = picturePath;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", buildTime=" + buildTime +
                ", picturePath='" + picturePath + '\'' +
                '}';
    }
}
