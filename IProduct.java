/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.st10533635_prog6112_exam.question1;

/**
 * Contract for the product sales calculations (Q.1.2).
 * Method names are PascalCase because the exam paper prescribes them.
 * @author Cleopatra Tayeta
 */


public interface IProduct {

    /** @return the total number of products sold across all products and months */
    int GetTotalProductsSold();

    /** @return the average number of products sold per product per month */
    double GetAverageProductSold();

    /** @return the name and total sales of the product with the highest total sales */
    String GetMostPopularProduct();
}