/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase()); // Se presenta el valor en minusculas.
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);// Se presenta el valor en  mayusculas porque se le asigno ese valor en la linea 15.
        // toLowerCase es un método, sirve para convertir los caracteres que conforman un valor a minusculas.
        // toUpperCase es un método, sirve para convertir los caratceres que conforman un valor a mayusculas.
      
    }
}
