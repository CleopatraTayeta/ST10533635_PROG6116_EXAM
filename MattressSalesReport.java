/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10533635_prog6112_exam.question1;

import java.util.Scanner;

/**
 * Q.1.1 - Captures three months of sales for three mattress products
 * and prints the product sales report.
 * @author Cleopatra Tayeta
 */


public class MattressSalesReport {

    private static final int MONTHS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional array: product names
        String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

        // Two-dimensional array: rows = products, columns = months
        int[][] monthlySales = new int[productNames.length][MONTHS];

        // Populate the arrays from user input
        for (int p = 0; p < productNames.length; p++) {
            for (int m = 0; m < MONTHS; m++) {
                monthlySales[p][m] = readSales(input, m + 1, productNames[p]);
            }
            System.out.println(); // blank line between products
        }

        // Calculations are done by Product, printing by PrintProduct
        Product product = new Product(productNames, monthlySales);
        PrintProduct printer = new PrintProduct(product);

        printer.PrintHeading();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();

        input.close();
    }

    /** Prompts until the user enters a valid whole number of 0 or more. */
    private static int readSales(Scanner input, int month, String productName) {
        while (true) {
            System.out.print("Enter number of sales for month " + month
                    + " for " + productName + " mattress: ");
            try {
                int sales = Integer.parseInt(input.nextLine().trim());
                if (sales >= 0) {
                    return sales;
                }
            } catch (NumberFormatException e) {
                // fall through to the error message below
            }
            System.out.println("Invalid input. Please enter a whole number of 0 or more.");
        }
    }
}