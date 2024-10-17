package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En un juego de Mario, calcula cuántas vidas extra tiene el jugador si obtiene 
 * 250 monedas (usa Math.floor() para las divisiones entre 100).
 */
public class Ejercicio15 {
public static void main(String[] args) {
    int monedas = 250;
    int monedasVida = 100;
    double division = (double) monedas / monedasVida;
    int vidasExtra = (int) Math.floor(division);
    System.out.println(vidasExtra + " vidas extra");
    }
}