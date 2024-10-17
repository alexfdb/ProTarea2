package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dado el código Sith: "La paz es una mentira, solo hay pasión", crea un 
 * programa que cuente cuántas veces aparece la palabra "es".
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        String frase = "La paz es una mentira, solo hay pasión";

        int contador = 0;
        String[] palabrasFrase = frase.split(" ");

        for (String palabras : palabrasFrase) {
            boolean contieneEs = palabras.equals("es");

            if (contieneEs) { 
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("La frase contiene " + contador + " 'es' ");
        } else {
            System.out.println("La frase no contiene 'es' ");
        }
    }
}