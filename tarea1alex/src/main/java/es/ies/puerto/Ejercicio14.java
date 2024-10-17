package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Calcula la potencia de Superman en función de un poder inicial de 5 elevado 
 * a la fuerza de un enemigo (usa el método Math.pow()).
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int poderSuperman = 5;
        int poderEnemigo = 3;
        double calculoPotencia = Math.pow(poderSuperman,poderEnemigo);
        System.out.println(calculoPotencia);
    }
}