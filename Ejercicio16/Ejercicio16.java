package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        while (contador < 5) {
            contador = contador + 1;
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            if (num == 0) {
                System.out.println("0 captado");
                break;
            } else {
                if (num > 0) {
                    suma = suma + num;
                }
            }
        }
        System.out.println("Sumatoria: " + suma);
    }

}
