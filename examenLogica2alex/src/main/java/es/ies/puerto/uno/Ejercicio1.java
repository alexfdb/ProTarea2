package es.ies.puerto.uno;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que solicite al usuario una palabra o frase y determine 
 * si es un palíndromo. Un palíndromo es una palabra o frase que se lee igual de 
 * adelante hacia atrás ignorando espacios, mayúsculas y puntuación.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String frase = "Anita lava la tina";

        frase = frase.toLowerCase().replace(" ", "");
        StringBuilder fraseInvertida = new StringBuilder(frase).reverse();

        if (frase.equals(fraseInvertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}