package com.mycompany.product;

public class PrintProduct {
    
    public void printReport(IProduct product) {
        System.out.println("--- SALES REPORT ---");
        System.out.println("Total Products Sold: " + product.GetTotalProductsSold());
        System.out.println("Average Products Sold: " + product.GetAverageProductSold());
        System.out.println("Most Popular Product: " + product.GetMostPopularProduct());
    }
}