/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.ejercicio1;

/**
 *
 * @author Arturo
 */
public class Ejercicio1 {
    
    public static boolean capicua(int[] arreglo, int inicio, int fin) {

        if (inicio >= fin) {
            return true;
        }

        if (arreglo[inicio] == arreglo[fin]) {
            return capicua(arreglo, inicio + 1, fin - 1);
        } else {
            return false;
        }
    }
    
    public static boolean capicua(int[] arreglo){
        return capicua(arreglo,0, arreglo.length -1);
    }
    
    public static void main(String[] args) {
        
        int[] arreglo1 = {20,30,15,10,10,15,30,20};  //true
        System.out.println(capicua(arreglo1));
        
        
        int[] arreglo2 = {20,30,15,10,10,12,30,20};  //false
        System.out.println(capicua(arreglo2));
        
        int[] arreglo3 = {1, 2, 3, 4, 5, 4, 3, 2, 1};  //true
        System.out.println(capicua(arreglo3));
        
        
        int[] arreglo4 = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};  //false
        System.out.println(capicua(arreglo4));
    }
}
