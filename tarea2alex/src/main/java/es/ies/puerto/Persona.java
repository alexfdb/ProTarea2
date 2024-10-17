package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.1.0
 * 
 * Ejercicio 1 Crea una clase llamada Persona con los atributos nombre y edad. 
 * Define un constructor que inicialice estos valores.
 * Crea un objeto de la clase Persona con nombre __"Juan" y edad 30. Muestra la 
 * información de la persona.(Hecho en el 'Main')
 * 
 * Ejercicio 2 Modifica la clase Persona para que tenga métodos getter y setter para el atributo edad.
 * Crea un objeto de la clase Persona con nombre "Maria" y edad 25. 
 * Modifica la edad a 26 usando el setter y muestra la edad actualizada.
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * Constructor por defecto
     */
    public Persona () {}
    
    /**
     * Constructor completo
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        validarEdad(edad);
        this.edad = edad;
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    private void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    @Override
    public String toString(){
        return "Persona{" + 
                "Nombre: " + nombre +
                ", Edad: " + edad +
                '}';
    }
}