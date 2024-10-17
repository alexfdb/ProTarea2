package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dada la frase "Soy Batman", invierte la cadena usando métodos de StringBuilder.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = "Soy Batman";
        StringBuilder sbFrase = new StringBuilder(frase);
        sbFrase.reverse();
        System.out.println(sbFrase);
    }
}