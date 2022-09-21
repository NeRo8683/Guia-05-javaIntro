package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero");
        int nota = leer.nextInt();
        do {
            System.out.println("ingrese nota");
            nota = leer.nextInt();
        } while (nota < 0 || nota > 10);
    }

}
