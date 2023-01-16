/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.ejercicio2;

/**
 *
 * @author Arturo
 */
public class Main {
    
    public static void main(String[] args) {

        Cola c = new Cola();
        
        c.inserta(10);
        c.inserta(20);
        c.inserta(1);
        c.inserta(158);
        c.inserta(-8);
        c.inserta(2);
        
        System.out.println(c.toString());
        
        System.out.println("¿Esta en orden creciente?: " + c.ordenado());
        
        
    }
    
}
