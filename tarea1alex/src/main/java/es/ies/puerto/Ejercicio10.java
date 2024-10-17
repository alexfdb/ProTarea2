package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dada una lista de personajes en una batalla (separados por comas), imprime 
 * cuántos personajes hay en la batalla usando split().
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String lista = "Goku, Vegeta, Broly, Freezer";
        String[] palabras = lista.split(",");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
                contador++;
        }
        System.out.println(contador);
    }
}