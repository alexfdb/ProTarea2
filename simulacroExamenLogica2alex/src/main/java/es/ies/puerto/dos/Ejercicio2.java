package es.ies.puerto.dos;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 2 Escribe un programa que reciba un array de números enteros y 
 * cuente cuántas veces aparece cada número.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        boolean[] contados = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!contados[i]) {
                int conteo = 1;

                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        conteo++;
                        contados[j] = true;
                    }
                }
                String vez = (conteo == 1) ? "vez" : "veces";
                System.out.println(array[i] + " aparece " + conteo + " " + vez + ".");
            }
        }
        
    }
}