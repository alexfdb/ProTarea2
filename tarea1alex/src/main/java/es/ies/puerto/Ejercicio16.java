package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dado un número de experiencia XP como entero, determina cuántos niveles ha 
 * ganado un jugador si cada nivel requiere 500 XP (usa Math.floor()).
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int experiencia = 2300;
        int experienciaNivel = 500;

        double division = (double) experiencia / experienciaNivel;

        int niveles = (int) Math.floor(division);
        
        System.out.println(niveles + " niveles");
    }
}