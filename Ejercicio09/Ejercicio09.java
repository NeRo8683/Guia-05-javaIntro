package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra");
        String nom = leer.next();
        if (nom.toLowerCase().equals("eureka")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
