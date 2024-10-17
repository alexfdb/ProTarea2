package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 8 Crea una clase Empleado con los atributos nombre, puesto y salario. 
 * Usa getters y setters para cada atributo. El salario no puede ser negativo.
 * Crea un objeto de la clase Empleado con nombre "Ana", puesto "Gerente", y salario 5000. 
 * Asegúrate de que el salario no sea negativo.
 * 
 * Ejercicio 9 Modifica la clase Empleado para que el setter de puesto no permita valores vacíos o nulos.
 * Crea un objeto de la clase Empleado con nombre "Carlos", puesto "Ingeniero" y salario 3000. 
 * Intenta asignar un puesto vacío y muestra el resultado de la validación.
 */
public class Empleado {

    private String nombre;
    private String puesto;
    private float salario; 
    
    /**
     * Constructor por defecto
     */
    public Empleado(){}

    /**
     * Constructor completo
     * @param nombre Nombre del empleado
     * @param puesto Puesto del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String puesto, float salario){
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public float getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        validarPuesto(puesto);
        this.puesto = puesto;
    }

    public void setSalario(float salario) {
        validarSalario(salario);
        this.salario = salario;
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacío");
        }
    }

    public void validarPuesto(String puesto) {
        if (puesto == null || puesto.trim().isEmpty()) {
            throw new IllegalArgumentException("El puesto no puede ser null o estar vacío");
        }
    }

    public void validarSalario(float salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre: " + nombre + 
                ", Puesto: " + puesto + 
                ", Salario: " + salario + 
                '}';
    }
}
