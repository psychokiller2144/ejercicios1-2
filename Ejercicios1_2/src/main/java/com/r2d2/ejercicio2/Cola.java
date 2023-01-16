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
public class Cola {

    private Nodo cabeza; // aqui se guardara siempre el primer elemento de la cola

    public Cola(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Cola() {
        this.cabeza = null;
    }

    //metodo que inserta de manera convencional un elemento en la cola
    //por ejempplo, si tenemos los siguientes datos ya en nuestra cola: [3]->[6]->[0]-> e insertamos el elemento [5].
    //este metodo lo insertara al final de cola, siguiendo la regla FIFO (first in, first out/ primero en entrar, primero en salir)
    //el resultado seria el siguiente: [3]->[6]->[0]->[5]->.
    public void inserta(int numero) {

        //si esto se cumple, determinamos que la cola esta vacia, por lo tanto
        //el primer nodo, sera el que este a la cabeza de la cola
        if (this.cabeza == null) {
            this.cabeza = new Nodo(numero);
        } else {

            //guardamos en una variable auxiliar la direccion del primer nodo de la cola (el que esta a la cabeza)
            Nodo aux = this.cabeza;

            //simplemente iteramos sobre cada elemento de la cola, hasta llegar al final
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            //una vez llegamos al ultimo nodo, es ahi cuando agregamos el nuevo nodo, que es ahora el nuevo ultimo nodo
            aux.setSiguiente(new Nodo(numero));
        }
    }

    public void insertaOrdR(Nodo nuevoNodo, int numero) {

        if (this.cabeza == null || this.cabeza.getNumero() >= nuevoNodo.getNumero()) {

            nuevoNodo.setSiguiente(cabeza);
            this.cabeza = nuevoNodo;

        } else {

            //guardamos en una variable auxiliar la direccion del primer nodo de la cola (el que esta a la cabeza)
            Nodo aux = this.cabeza;

            while (aux.getSiguiente() != null && aux.getSiguiente().getNumero() < nuevoNodo.getNumero()) {
                aux = aux.getSiguiente();
            }

            nuevoNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevoNodo);
        }

    }

    public void insertaOrdR(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        insertaOrdR(nuevoNodo, numero);
    }
    
    //AQUI EL METODO IMPORTANTE QUE VERIFICA SI LOS ELEMENTOS 
    //ESTAN ORDENADOS DE MANERA CRECIENTE, USANDO RECURSION
    public boolean ordenado(Nodo nodo){
        
        if(nodo == null || nodo.getSiguiente() == null){
            return true;
        }
        
        return ( nodo.getNumero() < nodo.getSiguiente().getNumero() && ordenado(nodo.getSiguiente()));
    }
    
    public boolean ordenado(){
        return ordenado(this.cabeza);
    }
    
    @Override //metodo para regresar una representacion en String de la cola
    public String toString() {

        //si la cola esta vacia, pues nos ahorramos todo lo de abajo
        //y retornamos este mensaje
        if (this.cabeza == null) {
            return "No hay elementos en la cola";
        }

        //una manera eficiente de manejo de cadenas que cambian constantemente es mas eficiente que: 
        //"cadena1" + "cadena2" ..., usamos el metodo append(), para lograr el mismo resultado.
        StringBuilder cola = new StringBuilder();

        //guardamos en una variable auxiliar la direccion del primer nodo de la cola (el que esta a la cabeza)
        Nodo aux = this.cabeza;

        //simplemente iteramos sobre cada elemento de la cola, hasta llegar al final
        while (aux != null) {
            cola.append(aux.toString());
            aux = aux.getSiguiente();
        }

        return cola.toString();
    }
}
