package es.ies.puerto.cuatro;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 4 Escribe un programa que reciba una cadena de texto y cuente 
 * cuántas vocales tiene.
 */

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escriba la frase a la que quiera contar sus vocales");
        String frase =  escaner.nextLine();
        frase = frase.toLowerCase();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            boolean vocal = letra == 'a'|| letra == 'á' || letra == 'e'|| letra == 'é'|| letra == 'i'|| 
                            letra == 'í'|| letra == 'o'||  letra == 'ó'|| letra == 'u'|| letra == 'ú'; 

            if (vocal) {
                contador++;
            }
        }
        
        System.out.println(contador);

        escaner.close();
    }
}