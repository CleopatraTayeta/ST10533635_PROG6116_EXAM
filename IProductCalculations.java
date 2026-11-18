/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10533635_prog6112_exam.question2;

/**
 *Contract for the sale calculations (Q.2.5).
 * @author Cleopatra Tayeta
 */

public interface IProductCalculations {

    /** @return VAT amount (15% of the product price) */
    double GetVat();

    /** @return commission amount (5% of the product price) */
    double GetCommission();

    /** @return total sale amount (price + VAT + commission) */
    double GetTotal();
}