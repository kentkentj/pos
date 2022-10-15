/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pos;

/**
 *
 * @author Kent
 */
public class Cost {
    public double change(double cash,double subtotal){
        if(subtotal < cash){
            return 0.00;
        } else{
            return subtotal - cash;
        }
    }
}
