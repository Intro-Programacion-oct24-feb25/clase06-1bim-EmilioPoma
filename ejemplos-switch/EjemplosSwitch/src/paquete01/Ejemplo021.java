/*


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese su dia de nacimiento:");
        int diaNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su mes de nacimiento:");
        int mesNacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su año de nacimiento:");
        int yearNacimiento = entrada.nextInt();
        
        String mesCadena = "";
  
        switch (mesNacimiento) {
            case 1:
                mesCadena = "enero";
                break;

            case 2:
                mesCadena = "febrero";
                break;

            case 3:
                mesCadena = "marzo";
                break;

            case 4:
                mesCadena = "abril";
                break;

            case 5:
                mesCadena = "mayo";
                break;

            case 6:
                mesCadena = "junio";
                break;

            case 7:
                mesCadena = "julio";
                break;
                
            case 8:
                mesCadena = "agosto";
                break;
                
            case 9:
                mesCadena = "septiembre";
                break; 
            
            case 10:
                mesCadena = "octubre";
                break;
                
            case 11:
                mesCadena = "noviembre";
                break;
            
            case 12:
                mesCadena = "diciembre";
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        mesCadena = mesCadena.toUpperCase();
        System.out.printf("Usted ha nacido el %s de %s de %s\n ", diaNacimiento,
                        mesCadena, yearNacimiento);

    }
}
