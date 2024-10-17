package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dado el nombre de un Pokémon (como "Pikachu"), crea un programa que convierta 
 * el nombre en mayúsculas, minúsculas, y que también imprima la longitud del nombre.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombrePokemon = "Pikachu";
        String nombreMayusculas = (nombrePokemon.toUpperCase());
        String nombreMinusculas = (nombrePokemon.toLowerCase());
        int nombreLongitud = (nombrePokemon.length());
        System.out.println("Mayúsculas: " + nombreMayusculas);
        System.out.println("Minúsculas: " + nombreMinusculas);
        System.out.println("Longitud: " + nombreLongitud);
    }
}