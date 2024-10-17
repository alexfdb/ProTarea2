package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 13 Crea una clase Alumno con los atributos nombre y nota. 
 * Implementa un método que determine si el alumno ha aprobado (nota >= 6).
 * Crea un objeto de la clase Alumno con nombre "Lucía" y nota 7. 
 * Determina si el alumno ha aprobado.
 * 
 * Ejercicio 14 Modifica la clase Alumno para que la nota no pueda ser mayor a 
 * 10 ni menor a 0 en el setter.
 * Crea un objeto de la clase Alumno con nombre "Jorge" y nota 11. 
 * Asegúrate de que la nota no pueda ser mayor que 10 ni menor que 0.
 */
public class Alumno {
    
    private String nombre;
    private float nota;

    /**
     * Constructor por defecto
     */
    public Alumno() {}

    /**
     * Constructor completo
     * @param nombre
     * @param nota
     */
    public Alumno(String nombre, float nota) {
        setNombre(nombre);
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        validarNota(nota);
        this.nota = nota;
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacío");
        }
    }

    public void validarNota (float nota) {
        if (nota < 0) {
            throw new IllegalArgumentException("La nota no puede tener un valor negativo");
        } else if (nota > 10) {
            throw new IllegalArgumentException("La nota no puede ser mayor a diez");
        }
    }

    /**
     * 
     * @param alumno
     */
    public boolean aprobado() {
        return (this.nota >= 6);
    }

    @Override
    public String toString() {
        return "Alumno{" + 
                "Nombre: " + nombre +
                ", Nota: " + nota + 
                '}';
    }
}
