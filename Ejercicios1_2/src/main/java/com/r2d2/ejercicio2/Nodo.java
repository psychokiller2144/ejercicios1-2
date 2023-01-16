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
public class Nodo {

    private int numero;
    private Nodo siguiente;

    public Nodo() {
        this.numero = 0;
        this.siguiente = null;
    }

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public Nodo(int numero, Nodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String toString() {
        return "[" + numero + "]->";
    }
}
