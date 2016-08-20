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
public class Binaria extends Busquedas {

    //Constructor
    public Binaria(int x) {
        super(x);
    }

    /**
     * Hace la funcion de buscar de manera binaria el dato, hace uso del method
     * showResultado para mostrar el numero de ciclos, y la posicion en que se
     * encontro.
     * @param array, el vector.
     * @param x, el numero a buscar.
     */
    @Override
    public void buscar(int array[], int x) {
        int inicio, fin, centro;
        int c = 1;
        inicio = 0;
        fin = array.length;
        boolean flag = true;
        
        System.out.println("Busqueda Binaria");
        while (inicio < fin) {
            centro = (inicio + fin) / 2;
            if (array[centro] == x) {
                flag = true;
                showResultado(centro, c);
                inicio = fin + 1;
            } else if (x < array[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
            c++;
        }
        if (!flag) {
            showResultado(null, null);
        }
    }
}
