package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dada la frase "Un Anillo para gobernarlos a todos", comprueba si contiene la 
 * palabra "gobernarlos" usando el método contains().
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String frase = "Un Anillo para gobernarlos a todos";
        boolean gobernarlosFrase = (frase.contains("gobernarlos"));
        System.out.println(gobernarlosFrase);
    }
}