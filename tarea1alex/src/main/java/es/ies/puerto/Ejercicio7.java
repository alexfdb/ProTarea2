package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dado un texto sobre Wakanda, usa el método substring() para extraer solo la 
 * palabra "Wakanda" de la frase "El vibranium en Wakanda es sagrado".
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = "El vibranium en Wakanda es sagrado";
        String palabra = frase.substring(16,23);
        System.out.println(palabra);
    }
}