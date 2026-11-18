/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10533635_prog6112_exam.question1;

/**
 * Holds the sales data and performs the report calculations (Q.1.2).
 * productNames : single-dimensional array  (one entry per product)
 * monthlySales : two-dimensional array     (rows = products, columns = months)
 * @author Cleopatra Tayeta
 */

public class Product implements IProduct {

    private final String[] productNames;
    private final int[][] monthlySales;

    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    /** Adds up the sales of one product over all months. */
    private int getProductTotal(int productIndex) {
        int total = 0;
        for (int sales : monthlySales[productIndex]) {
            total += sales;
        }
        return total;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            total += getProductTotal(i);
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        // Number of sales entries = products x months (e.g. 3 x 3 = 9)
        int entries = monthlySales.length * monthlySales[0].length;
        if (entries == 0) {
            return 0; // avoid division by zero
        }
        return (double) GetTotalProductsSold() / entries;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = getProductTotal(0);

        // Find the product with the highest total sales
        for (int i = 1; i < productNames.length; i++) {
            int total = getProductTotal(i);
            if (total > bestTotal) {
                bestTotal = total;
                bestIndex = i;
            }
        }
        return productNames[bestIndex] + "(" + bestTotal + ")";
    }
}