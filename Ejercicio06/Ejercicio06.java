package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero");
        int num = leer.nextInt();
        System.out.println("doble= "+num*2);
        System.out.println("triple= "+num*3);
        System.out.println("raiz= "+Math.sqrt(num));
    }
    
}
