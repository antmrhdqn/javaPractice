package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {

    private int pId;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {

    }

    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;

        ProductController.count++;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String information() {
        return "제품번호=" + this.pId + ", 제품명=" + this.pName + ", 가격=" + this.price + ", 세금=" + this.tax;
    }
}