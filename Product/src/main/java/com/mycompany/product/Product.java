package com.mycompany.product;

import java.util.HashMap;
import java.util.Map;

public class Product implements IProduct {
    
    private Map<String, Integer> salesData = new HashMap<>();

    public void addSales(String productName, int quantity) {
        salesData.put(productName, salesData.getOrDefault(productName, 0) + quantity);
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int quantity : salesData.values()) {
            total += quantity;
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        if (salesData.isEmpty()) {
            return 0.0;
        }
        return (double) GetTotalProductsSold() / salesData.size();
    }

    @Override
    public String GetMostPopularProduct() {
        String mostPopular = "None";
        int maxSales = -1;

        for (Map.Entry<String, Integer> entry : salesData.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        return mostPopular;
    }
}