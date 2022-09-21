package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int correcto = 0;
        int incorrecto = 0;
        System.out.println("''Ingrese una frase''");
        System.out.println("(Frases iniciadas con 'x' y finalizadas en 'o' son correctas)");
        String frase = leer.nextLine();
        System.out.println(frase);
        while (!frase.equals("&&&&&")) {
            if (frase.length() != 5) {
                incorrecto += 1;
            } else {
                if (frase.toLowerCase().substring(0, 1).equals("x") 
                        && frase.toLowerCase().substring(frase.length() - 1, frase.length()).equals("o")) {
                    correcto = correcto + 1;
                } else {
                    incorrecto = incorrecto + 1;
                }
            }
            System.out.println("Ingrese nuevamente. Pulse &&&&& para salir");
            frase = leer.nextLine();

        }
        if (frase.equals("&&&&&")) {
            System.out.println("Veces leidas correctamente: " + correcto + " veces");
            System.out.println("Veces leidas incorrectamente: " + incorrecto + " veces");
        }
        leer.close();

    }

}
