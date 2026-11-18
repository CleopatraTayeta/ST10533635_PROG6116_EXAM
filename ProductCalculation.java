/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10533635_prog6112_exam.question2;

/**
 *Calculates the VAT, commission and total sale amount for a product price (Q.2.5).
 * @author Cleopatra Tayeta
 */


public class ProductCalculation implements IProductCalculations {

    private static final double VAT_RATE = 0.15;        // 15%
    private static final double COMMISSION_RATE = 0.05; // 5%

    private final double price;

    public ProductCalculation (double price) {
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
        // Reuse the other methods so the rates are only defined once
        return price + GetVat() + GetCommission();
    }
}