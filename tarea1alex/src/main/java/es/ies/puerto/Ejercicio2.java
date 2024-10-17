package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dado un nombre de mago como entrada, crea un programa que imprima un saludo 
 * personalizado en formato: "¡Bienvenido, [nombre del mago], a Hogwarts!"
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombreMago = "Harry";
        String saludoMago = "¡Bienvenido, " + nombreMago + ", a Hogwarts!";
        System.out.println(saludoMago);
    }
}