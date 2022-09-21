package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese temperatura Celsius");
        int cel = leer.nextInt();
        int far = 32 + (9 * cel/5);
        System.out.println(cel+"°C = "+far+"°F");
    }
    
}
