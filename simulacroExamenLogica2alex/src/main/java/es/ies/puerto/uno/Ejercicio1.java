package es.ies.puerto.uno;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 1 Crea un programa que solicite un año al usuario y determine si es 
 * bisiesto (divisible por 4, pero no por 100, excepto si es divisible por 400).
 */

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el año");
        int anio = escaner.nextInt();

        boolean anioDivisible4 = (anio % 4 == 0);
        boolean anioDivisible100 = (anio % 100 == 0);
        boolean anioDivisible400 = (anio % 400 == 0);

        if (anioDivisible4 && !anioDivisible100) {
            System.out.println(anio +  ": Cumple la regla de ser divisible por 4 y no por 100, por lo que es bisiesto.");
        }

        if (anioDivisible4 && anioDivisible100 && !anioDivisible400) {
            System.out.println(anio + ": Aunque es divisible por 4 y 100, al no ser divisible por 400, no es bisiesto.");
        }

        if (anioDivisible4 && anioDivisible100 && anioDivisible400) {
            System.out.println(anio + ": Al ser divisible por 4, 100 y 400, es bisiesto.");
        }

        if (!anioDivisible4) {
            System.out.println(anio + ": No es bisiesto.");
        }

        escaner.close();
    }
}