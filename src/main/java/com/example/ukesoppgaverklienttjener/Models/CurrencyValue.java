package com.example.ukesoppgaverklienttjener.Models;

public class CurrencyValue {
    private String currency;
    private double amount;

    public CurrencyValue(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
