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
public class EDDMartínezCA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, select;

        System.out.println("Bienvenido");
        do {
            System.out.println("");
            System.out.println("Seleccione una opcion para continuar: ");
            System.out.println("Selecccione '1' para crear un vector de Busqueda Secuencial");
            System.out.println("Seleccione '2' para crear un vector de Busqueda Binaria");
            System.out.println("Seleccione '3' para salir");
            select = scan.nextInt();
            int select2;
            switch (select) {

                case 1:
                    System.out.println("Cuantos espacios tendra el vector?");
                    x = scan.nextInt();
                    Secuencial serieS = new Secuencial(x);
                    do {
                        System.out.println("");
                        System.out.println("Seleccione una opcion para continuar: ");
                        System.out.println("Selecccione '1' para mostrar el vector");
                        System.out.println("Selecccione '2' para volver a escribir los datos del vector");
                        System.out.println("Selecccione '3' para buscar un dato de manera secuencial");
                        System.out.println("Selecccione '4' para salir");
                        select2 = scan.nextInt();
                        switch (select2) {
                            case 1:
                                serieS.showVector();
                                break;
                            case 2:
                                serieS.setVector();
                                break;
                            case 3:
                                serieS.queBusco();
                                break;
                            case 4:
                                break;
                        }
                    } while (select2 != 4);
                    break;
                    
                case 2:
                    System.out.println("Cuantos espacios tendra el vector?");
                    x = scan.nextInt();
                    Binaria serieB = new Binaria(x);
                    do {
                        System.out.println("");
                        System.out.println("Seleccione una opcion para continuar: ");
                        System.out.println("Selecccione '1' para mostrar el vector");
                        System.out.println("Selecccione '2' para volver a escribir los datos del vector");
                        System.out.println("Selecccione '3' para buscar un dato de manera Binaria");
                        System.out.println("Selecccione '4' para salir");
                        select2 = scan.nextInt();
                        switch (select2) {
                            case 1:
                                serieB.showVector();
                                break;
                            case 2:
                                serieB.setVector();
                                break;
                            case 3:
                                serieB.queBusco();
                                break;
                            case 4:
                                break;
                        }
                    } while (select2 != 4);
                    break;
                    
                case 3:
                    break;
            }

        } while (select != 3);
    }

}
