package com.mycompany.product;

public class Main {
    public static void main(String[] args) {
        Product myProducts = new Product();
        
        // Add sample data
        myProducts.addSales("Cozy Nights Monarch", 50);
        myProducts.addSales("Restonic Barbados", 30);
        myProducts.addSales("Sealy Phuket", 20);
        
        PrintProduct printer = new PrintProduct();
        printer.printReport(myProducts);
    }
}