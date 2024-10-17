package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que convierta un poder de pelea (entero) en un string y 
 * viceversa usando los métodos Integer.parseInt() y Integer.toString().
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String cadena = "5000";
        Integer entero = 4000;
        Integer cadenaEntero = Integer.parseInt(cadena);
        String enteroCadena = Integer.toString(entero);
        System.out.println(cadenaEntero + " (entero desde cadena)");
        System.out.println(enteroCadena + " (cadena desde entero)");
    }
}