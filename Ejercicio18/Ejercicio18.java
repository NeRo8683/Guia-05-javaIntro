/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author a
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        String cadena, unid, dec, cent;
        int unidad = 0, decena = 0, centena = 0;
        boolean seguir = true;
        
        while(seguir) {
            if(unidad == 3) {
                unid = "E";
            } else {
                unid = String.valueOf(unidad);
            }
            if(decena == 3) {
                dec = "E";
            } else {
                dec = String.valueOf(decena);
            }
            if(centena == 3) {
                cent = "E";
            } else {
                cent = String.valueOf(centena);
            }
            cadena = cent + " - " + dec + " - " + unid; 
            
            unidad += 1;
            if(unidad == 10) {
                unidad = 0;
                decena += 1;
            }
            if(decena == 10) {
                decena = 0;
                centena += 1;
            }
            if(centena == 9 && decena == 9 && unidad == 9 ) {
                seguir = false;
            }
            System.out.println(cadena);
     }
        System.out.println("9 - 9 - 9");
    }
    
}
