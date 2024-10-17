package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Simula el daño crítico de un ataque multiplicando el daño base por un número 
 * aleatorio entre 1.5 y 2.0 usando Math.random().
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int dañoBase = 200;
        double criticoMin = 1.5;
        double criticoMax = 2.0;
        
        double porcentajeCritico = criticoMin + (Math.random() * (criticoMax - criticoMin));
        double dañoTotal = dañoBase * porcentajeCritico;
        
        System.out.println(dañoTotal);
    }
}