/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a04;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public class Secuencial extends Busquedas {

    //Constructor
    public Secuencial(int x) {
        super(x);
    }

    /**
     * Hace la funcion de buscar secuencialmente el dato, hace uso del method
     * showResultado para mostrar el numero de ciclos, y la posicion en que se
     * encontro.
     * @param array, el vector.
     * @param x, el numero a buscar.
     */
    @Override
    public void buscar(int array[], int x) {
        boolean flag = false;
        System.out.println("Busqueda Secuencial");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                showResultado(i, i + 1);
                i = array.length - 1;
                flag = true;
            }
        }
        if (!flag) {
            showResultado(null, null);
        }
    }
}
