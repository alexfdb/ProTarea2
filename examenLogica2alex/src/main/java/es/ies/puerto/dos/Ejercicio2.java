package es.ies.puerto.dos;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que dado un array determine cuál es el número mayor y cuál es 
 * el menor. Algunas pruebas para verificar su comportamiento son las siguientes.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {34, 12, 89, 5, 67};

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeroMayor < numeros[i]) {
                numeroMayor = numeros[i];
            }

            if (numeroMenor > numeros[i]) {
                numeroMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es " + numeroMayor + " y el número menor es " + numeroMenor + ".");
    }
}