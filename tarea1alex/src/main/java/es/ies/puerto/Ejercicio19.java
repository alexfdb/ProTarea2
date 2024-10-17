package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que simule el lanzamiento de un dado de 20 caras usando 
 * Math.random() y que imprima el resultado del lanzamiento.
 */

public class Ejercicio19 {
public static void main(String[] args) {

    int dado20 = (int) (Math.random() * 20) + 1;

    System.out.println("El resultado del dado es: " + dado20);
    
    }
}