package com.mycompany.productgui;

public class ProductCalculations implements IProductCalculations {
    
    private double price;
    private final double VAT_RATE = 0.15;       // 15% VAT
    private final double COMMISSION_RATE = 0.05; // 5% Commission

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * VAT_RATE;
    }

    @Override
    public double GetCommission() {
        return price * COMMISSION_RATE;
    }

    @Override
    public double GetTotal() {
        // Total is the price + VAT + Commission
        return price + GetVat() + GetCommission();
    }
}