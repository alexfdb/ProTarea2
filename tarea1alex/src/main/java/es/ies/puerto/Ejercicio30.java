package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Un viajero del espacio está tratando de calcular el tiempo que tardará en 
 * llegar a su destino a través del hiperespacio. La distancia a su destino es 
 * de ( 4.5 \times 10^{16} ) metros y viaja a una velocidad constante de 
 * ( 2.0 \times 10^{8} ) metros por segundo. Usa la fórmula:

[ t = \frac{d}{v} ]

donde ( t ) es el tiempo en segundos, ( d ) es la distancia y ( v ) es la 
velocidad. Calcula el tiempo de viaje.
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        double distancia = 4.5 * Math.pow(10, 10);
        double velocidad = 2 * Math.pow(10, 8);

        double tiempo = distancia / velocidad;

        long tiempoSegundos = Math.round(tiempo);

        System.out.println("t = " + tiempoSegundos + " segundos");
    }
}