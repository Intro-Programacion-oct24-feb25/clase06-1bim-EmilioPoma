/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import static java.lang.Character.toUpperCase;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        cadena = cadena.toLowerCase();
        
        switch(cadena){
            case "lunes":
            
                System.out.printf("%s", cadena.toUpperCase());
                break;
          
            case "martes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
     
            case "viernes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "domingo":
                System.out.printf("%s, es el séptimo día "
                        + "de la semana", cadena.toUpperCase());
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
