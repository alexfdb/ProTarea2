package es.ies.puerto.seis;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea una clase llamada Círculo que represente un círculo. Debe de poseer 
 * como atributo su radio, para obtener el perímetro de este.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);

        System.out.println(circulo1);
        System.out.println(circulo1.calcularPerimetro());

        circulo1.setRadio(7);

        System.out.println(circulo1.calcularPerimetro());
        System.out.println(circulo1);
    }
}