package es.ies.puerto;

/**
 * @author alexfdb
 * @Version 1.0.0
 * Ejercicio 17 Crea una clase Vehiculo con los atributos marca, modelo y combustible. 
 * Define un método que permita agregar combustible al vehículo.
 * Crea un objeto de la clase Vehiculo con marca "Honda", modelo "Civic", y combustible 40 litros. 
 * Agrega 20 litros de combustible al vehículo.
 * 
 * Ejercicio 18 Modifica la clase Vehiculo para que el setter de combustible no permita valores negativos.
 * Crea un objeto de la clase Vehiculo con marca "Ford", modelo "Fiesta", y combustible 15 litros. Intenta 
 * asignar un valor negativo al combustible y muestra el resultado de la validación.
 */

public class Vehiculo {

    private String marca;
    private String modelo;
    private float combustible;

    /**
     * Constructor por defecto
     */
    public Vehiculo() {}
    
    /**
     * Constructor completo
     * 
     * @param marca
     * @param modelo
     * @param combustible
     */
    public Vehiculo(String marca, String modelo, float combustible) {
        setMarca(marca);
        setModelo(modelo);
        setCombustible(combustible);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCombustible() {
        return combustible;
    }

    public void setMarca(String marca) {
        validarMarca(marca);
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        validarModelo(modelo);
        this.modelo = modelo;
    }

    public void setCombustible(float combustible) {
        validarCombustible(combustible);
        this.combustible = combustible;
    }

    public void validarMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser null o estar vacía");
        }
    }

    public void validarModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede ser null o estar vacío");
        }
    }

    public void validarCombustible(float combustible) {
        if (combustible < 0) {
            throw new IllegalArgumentException("El combustible no puede tener un valor negativo");
        }
    }
    
    public void repostarVehiculo(float cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a repostar no puede ser negativa");
        }
        this.combustible += cantidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + 
                "Marca: " + marca + 
                ", Modelo: " + modelo +
                ", Combustible: " + combustible +
                '}';
    }
}
