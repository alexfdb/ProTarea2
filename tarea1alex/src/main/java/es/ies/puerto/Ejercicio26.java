package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Compara el poder de pelea de Goku (9000) con el de Vegeta (8500) usando el 
 * método Integer.compare().
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        int poderGoku = 9000;
        int poderVegeta = 8500;

        int comparacion = Integer.compare(poderGoku, poderVegeta);

        int diferencia = poderGoku - poderVegeta;

        if (comparacion > 0) {
            System.out.println("Goku es mas poderoso que Vegeta");
        } else if (comparacion < 0) {
            System.out.println("Vegeta es mas poderoso que Goku");
        } else {
            System.out.println("Goku y Vegeta son igual de poderosos");
        }
            System.out.println("La diferencia de poder es de " + diferencia + ".");
    }
}