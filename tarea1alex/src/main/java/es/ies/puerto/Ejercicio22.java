package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Dado un hechizo como "Expecto Patronum", crea un programa que verifique si 
 * comienza con "Expecto" y termina con "Patronum".
 */

    public class Ejercicio22 {
    public static void main(String[] args) {
        String hechizo = "Expecto Patronum";

        boolean inicioExpecto = hechizo.startsWith("Expecto");
        boolean finPatronum = hechizo.endsWith("Patronum");

        System.out.println("¿El hechizo empieza por Expecto? " + inicioExpecto + ".");
        System.out.println("¿El hechizo termina por Patronum? " + finPatronum + ".");

        if (inicioExpecto && finPatronum) {
            System.out.println("El hechizo es valido.");
        } else {
            System.out.println("El hechizo no es valido.");
        }
    }
}