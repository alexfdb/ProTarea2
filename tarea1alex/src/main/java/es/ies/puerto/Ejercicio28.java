package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dado que el rayo de Thor tiene una velocidad v = 3 * 10^8 m/s y la distancia a la Tierra es d = 1.5 * 10^11 metros, 
 * calcula el tiempo que tarda en llegar usando la fórmula t = d / v.
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        double  velocidadRayo = 3 * Math.pow(10, 8);
        double distanciaTierra = 1.5 * Math.pow(10, 11);

        long tiempoImpacto =(long) (distanciaTierra / velocidadRayo);

        System.out.println("t = " + tiempoImpacto + " segundos");

    }
}