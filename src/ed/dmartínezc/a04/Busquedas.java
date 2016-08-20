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
     * Sobreescribe lo que hay en los espacios del vector
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
     * Method, pregunta el numero a buscar en el vector y lo envia al method
     * buscar.
     * 
     */
    public void queBusco() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que numero voy a buscar? ");
        buscar(vector, scan.nextInt());
    }

    /**
     * Imprime el contenido de los espacios del vector, haciendo uso del
     * method getVector.
     */
    public void showVector() {
        getVector();
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + getVector()[i] + "]");
        }
        System.out.println("");
    }

    /**
     * Imprime la posicion y los ciclos que se tomaron para encontrar el valor
     * en el vector.
     * 
     * @param pos, la posicion en el vector del dato buscado.
     * @param ciclos, el numero de ciclos tomados para encontrarlo.
     */
    public void showResultado(Integer pos, Integer ciclos) {
        System.out.println("Dato encontrado en la posición: " + pos);
        System.out.println("Repeticion de ciclos: " + ciclos + "\n");
        if ((pos == null) || (ciclos == null)) {
            System.out.println("DATO NO ENCONTRADO");
        }
        System.out.println("");
    }

    /**
     * Overriden method in subclasses.
     * @param array, el vector.
     * @param x, el numero buscado.
     */
    public void buscar(int array[], int x) {
    }
}
