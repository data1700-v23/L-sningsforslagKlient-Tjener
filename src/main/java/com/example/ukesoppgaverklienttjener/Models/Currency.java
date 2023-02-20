package com.example.ukesoppgaverklienttjener.Models;


//Simple POJO (Plain Old Java Object) class for currency
public class Currency {
    private String type;
    private double rate;

    public Currency(String type, double rate) {
        this.type = type;
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
