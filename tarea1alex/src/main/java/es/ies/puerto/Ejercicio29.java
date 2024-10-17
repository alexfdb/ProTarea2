package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Simula un combate Pokémon y genera un daño aleatorio entre 50 y 100 
 * usando Math.random().
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        int dañoAleatorio = 50 + (int) (Math.random()*51);

        System.out.println(dañoAleatorio);
    }
}