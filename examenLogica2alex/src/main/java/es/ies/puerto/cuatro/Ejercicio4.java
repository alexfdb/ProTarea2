package es.ies.puerto.cuatro;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que solicite al usuario una 
 * oración y cuente cuántas palabras tiene.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = "Hoy es un buen día para aprender Java";

        String[] palabras = frase.trim().split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            contador++;
        }

        String palabraSingular = (contador == 1) ? "palabra" : "palabras";
        System.out.println("La oración tiene " + contador + " " + palabraSingular + ".");
    }
}