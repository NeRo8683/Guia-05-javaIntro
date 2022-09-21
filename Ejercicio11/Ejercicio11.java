package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra");
        String palabra = leer.next();
        String letra = palabra.substring(0, 1);
        if (letra.toLowerCase().equals("a")) {
//      if (palabra.substring(0, 1).toLowerCase().equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
