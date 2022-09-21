/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            while (numero > 20) {
                System.out.println("Escriba un numero menor o igual a 20");
                numero = leer.nextInt();
            }
            String cadena = "";
            for (int j = 0; j < numero; j++) {
                cadena += "*";
            }
            System.out.print(numero + " " + cadena);
            System.out.println("");
        }

    }

}
