package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dado el nombre "Thor Odinson", crea un programa que imprima solo el apellido 
 * usando substring() y indexOf().
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        String nombre = "Thor Odinson";

        int posicionEspacio = nombre.indexOf(" ");

        if (posicionEspacio != -1) {
            String apellido = nombre.substring(posicionEspacio + 1);
            System.out.println("Apellido: " + apellido);
        } else {
                System.out.println("No se encuentra la posición");
        }
    }
}