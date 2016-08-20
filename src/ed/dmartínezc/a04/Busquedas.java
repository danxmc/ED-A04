/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a04;

import java.util.Scanner;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public abstract class Busquedas {

    //Atributes
    protected int vector[];

    //Constructor
    /**
     * Crea los espacios del vector
     * @param x 
     */
    public Busquedas(int x) {
        vector = new int[x];
        setVector();
    }

    //Methods
    /**
     *
     */
    public void setVector() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Escribe el dato del vector en la posicion [" + i + "]: ");
            this.vector[i] = scan.nextInt();
        }

    }

    /**
     *
     * @return vector
     */
    public int[] getVector() {
        return vector;
    }

    /**
     *
     * @return
     */
    public void queBusco() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que numero voy a buscar? ");
        buscar(vector, scan.nextInt());
    }

    public void showVector() {
        getVector();
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + getVector()[i] + "]");
        }
        System.out.println("");
    }

    public void showResultado(Integer pos, Integer ciclos) {
        System.out.println("Dato encontrado en la posición: " + pos);
        System.out.println("Repeticion de ciclos: " + ciclos + "\n");
        if ((pos == null) || (ciclos == null)) {
            System.out.println("DATO NO ENCONTRADO");
        }
        System.out.println("");
    }

    public void buscar(int array[], int x) {
    }
}
