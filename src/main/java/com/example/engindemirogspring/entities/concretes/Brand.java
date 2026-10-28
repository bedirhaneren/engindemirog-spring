package com.example.engindemirogspring.entities.concretes;

public class Brand {
    private int id ;
    private String brandName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Brand() {
    }

    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }
}
