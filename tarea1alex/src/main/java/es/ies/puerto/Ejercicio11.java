package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dada la transformación Saiyan en nivel 9000, convierte este número a 
 * hexadecimal y binario usando métodos de Integer.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Integer numero = 9000;
        String hexaNunmero = Integer.toHexString(numero);
        String binaryNumero = Integer.toBinaryString(numero);
        System.out.println("Hexadecimal: " + hexaNunmero);
        System.out.println("Binario: " + binaryNumero);
    }
}