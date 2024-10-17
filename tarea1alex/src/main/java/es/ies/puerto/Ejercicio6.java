package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que dada la frase "Viva la Resistencia", cuente cuántas 
 * veces aparece la letra "a".
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "Viva la Resistencia";
        String[] letras = frase.split("a");
        int contador = letras.length;
        System.out.println(contador);
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
    }
}