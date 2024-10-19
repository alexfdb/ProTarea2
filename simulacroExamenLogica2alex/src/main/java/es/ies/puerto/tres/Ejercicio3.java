package es.ies.puerto.tres;

/**
 * @author alxfdb
 * @version 1.0.0
 * Ejercicio 3 Escribe un programa que imprima los números del 1 al 100. 
 * Para múltiplos de 3, imprime Fizz, para múltiplos de 5, imprime Buzz y 
 * para múltiplos de ambos imprime FizzBuzz. En caso de que no se cumpla ninguna 
 * condición no imprime nada para ese número.
 */

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un número hasta el que quieras imprimir FizzBuzz: ");
        int limite = escaner.nextInt();

        for (int i = 1; i <= limite; i++) {
            String mensaje = "";

            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if (divisible3) {
                mensaje += "Fizz";
            }

            if (divisible5) {
                mensaje += "Buzz"; 
            }

            if (mensaje.isEmpty()) {
                mensaje = Integer.toString(i);
            }

            System.out.println(mensaje);
        }

        escaner.close();
    }
}