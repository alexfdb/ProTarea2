package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dado el nombre "Goku", crea un programa que añada "SSJ" al final de su nombre 
 * dependiendo del nivel (e.g. "Goku SSJ1", "Goku SSJ2").
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = "Goku";
        String fase = "SSJ";
        byte nivel = 3;
        System.out.println(nombre + " " + fase + nivel);
    }
}