
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        int numUno = leer.nextInt();
        int numDos = leer.nextInt();
        int suma = numUno + numDos;
        System.out.println("La suma de los numeros ingresados es: "+suma);
    }
    
}
