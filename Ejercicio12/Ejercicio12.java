package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un num 1-4 para saber qué tipo de bomba es: ");
        int tipoMotor = leer.nextInt();
                
        switch(tipoMotor) {
            case 1:
                System.out.println("(1). La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("(2). La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("(3). La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("(4). La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
