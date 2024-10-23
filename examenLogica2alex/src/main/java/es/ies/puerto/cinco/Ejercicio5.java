package es.ies.puerto.cinco;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que genere un número aleatorio entre 1 y 100, y permita 
 * al usuario adivinarlo. Después de cada intento, el programa debe indicar si 
 * el número introducido es mayor o menor que el número generado. El usuario 
 * tendrá un máximo de 3 intentos hasta que el usuario adivine el número.
 */
import java.util.Scanner;
public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double numeroAleatorio = Math.random() * 101;
        numeroAleatorio = (int) numeroAleatorio;

        System.out.println("He generado un número del 1 al 100. Tienes 3 intentos para adivinarlo.");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un número del 1 al 100");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.println("Por favor, ingrese un número válido entre 1 y 100.");
                i--;
                continue;
            }

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
                break;
            }

            System.out.println("Te quedan " + (2 - i) + " intent(s).");
        }

        System.out.println("El numero era: " + numeroAleatorio);

        sc.close();
    }
}