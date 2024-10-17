package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba una entrada y convierta la primera letra de cada palabra en mayúscula 
 * (como si fuera el diario del Capitán Kirk).
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "en un universo alterno";

        String[] palabras = frase.split(" ");
        StringBuilder palabrasUnidas = new StringBuilder();
        String fraseCapitalizada  = "";
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) {

                String palabraCapitalizada = Character.toUpperCase(palabras[i].charAt(0)) + palabras[i].substring(1);
                palabrasUnidas.append(palabraCapitalizada).append(" ");

            }
        }
        
        fraseCapitalizada  = palabrasUnidas.toString().trim();

        System.out.println("Frase con mayúsculas: " + fraseCapitalizada );
    }
}
