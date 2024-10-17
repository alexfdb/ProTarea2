package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dada una dirección de Gotham como "Wayne Tower, Gotham City", usa el método 
 * split() para separar la torre del nombre de la ciudad.
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        String frase = "Wayne Tower, Gotham City";

        String[] palabrasFrase = frase.split(", ");

        String torre = palabrasFrase[0].trim();
        String ciudad = palabrasFrase[1].trim();

        System.out.println(torre);
        System.out.println(ciudad);

    }
}