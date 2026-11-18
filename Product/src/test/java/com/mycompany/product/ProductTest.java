package com.mycompany.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        // We set up sample data before running the tests
        product = new Product();
        product.addSales("Product A", 10);
        product.addSales("Product B", 20);
        product.addSales("Product C", 30);
        // Total sold = 60. Number of products = 3. Average = 20.0
    }

    // --- UNIT TEST 1 from Question Paper ---
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int expectedTotal = 60;
        int actualTotal = product.GetTotalProductsSold();
        
        assertEquals(expectedTotal, actualTotal, "The total products sold should be 60.");
    }

    // --- UNIT TEST 2 from Question Paper ---
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        double expectedAverage = 20.0;
        double actualAverage = product.GetAverageProductSold();
        
        assertEquals(expectedAverage, actualAverage, 0.01, "The average products sold should be 20.0.");
    }
}