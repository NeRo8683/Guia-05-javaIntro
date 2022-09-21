package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase");
        String frase = leer.next();
        System.out.println("MAYUSCULAS: "+frase.toUpperCase());
        System.out.println("minusculas: "+frase.toLowerCase());
        
    }

}
