/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10533635_prog6112_exam.question1;
import java.text.DecimalFormat;

/**
 *Responsible only for printing the report data (Q.1.3).
 * @author Cleopatra Tayeta
 */

public class PrintProduct {

    private static final String STARS = "**************************************************";

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    /** Prints the report heading. */
    public void PrintHeading() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println(STARS);
    }

    /** Prints the total product sales. */
    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    /** Prints the average product sales (whole numbers print without decimals, e.g. 17). */
    public void PrintAverageProductSales() {
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("AVERAGE PRODUCT SALES: " + format.format(product.GetAverageProductSold()));
    }

    /** Prints the most popular product. */
    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}