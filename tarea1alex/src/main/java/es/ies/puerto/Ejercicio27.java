package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dado el conteo de Midiclorianos de un Jedi, como 12500, convierte este 
 * número a hexadecimal y binario usando métodos de Integer.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        int midiclorianos = 12500;

        String midiclorianosBin = Integer.toBinaryString(midiclorianos);
        String midiclorianosHexa = Integer.toHexString(midiclorianos);

        System.out.println("Hexadecimal: " + midiclorianosHexa);
        System.out.println("Binario: " + midiclorianosHexa);
    }
}