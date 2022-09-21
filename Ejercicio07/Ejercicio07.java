package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        int numUno = leer.nextInt();
        int numDos = leer.nextInt();
        if (numUno > numDos) {
            System.out.println(numUno+" es mayor que "+numDos);
        }else{
            System.out.println(numUno+" es menor que "+numDos);
        }
        
    }
    
}
