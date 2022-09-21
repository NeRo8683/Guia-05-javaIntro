package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese limite");
        int limite = leer.nextInt();
        int suma = 0;
        while (limite > suma) {
            System.out.println("Ingrese numero");
            int num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("la sumatoria del los numeros ingresados es: " + suma);
    }

}
