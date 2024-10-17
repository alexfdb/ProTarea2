package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dadas las masas de dos planetas y la distancia entre ellos, calcula la fuerza 
 * gravitacional entre ellos usando la fórmula de la Ley de Gravitación Universal 
 * y Math.pow().
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        double masaPlaneta1 = 6e24;
        double masaPlaneta2 = 7e22;
        double distanciaPlanetasMetros = 4e8;

        final double constanteGravitacionUniversal = 6674e-11;

        double fuerzaGravitacional = constanteGravitacionUniversal * (masaPlaneta1 * masaPlaneta2) / Math.pow(distanciaPlanetasMetros, 2);
        
        System.out.println(fuerzaGravitacional);
    }
}