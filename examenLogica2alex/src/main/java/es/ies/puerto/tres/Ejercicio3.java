package es.ies.puerto.tres;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un número perfecto es un número positivo que es igual a la suma de todos sus 
 * divisores propios (excluyendo el mismo número). Escribe un programa que 
 * solicite un número al usuario y determine si es un número perfecto.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 6;
        int divisores = 0;

        for (int i = 1; i < numero - 1; i++) {
            if (numero % i == 0) {
                divisores += i;
            }
        }

        if (divisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        }
    }
}