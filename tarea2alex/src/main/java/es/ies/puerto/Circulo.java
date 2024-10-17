package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 19 Crea una clase Circulo con un atributo radio. Implementa un método que 
 * calcule el área y el perímetro del círculo. Usa getters y setters para el radio.
 * Crea un objeto de la clase Circulo con radio 5. Muestra el área y el perímetro del círculo.
 * 
 * Ejercicio 20 Modifica la clase Circulo para que el setter de radio solo acepte valores positivos y mayores a 0.
 * Crea un objeto de la clase Circulo con radio -3. Asegúrate de que el radio sea un valor positivo mayor a 0.
 */
public class Circulo {

    private float radio;

    /**
     * Constructor por defecto
     */
    public Circulo() {}

    public Circulo(float radio) {
        setRadio(radio);
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        validarRadio(radio);
        this.radio = radio;
    }

    public void validarRadio(float radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio no puede tener un valor negativo o ser cero");
        }
    }

    public float calcularArea() {
        return (float) Math.PI * (radio * radio);
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI) * radio;
    }
    
    @Override
    public String toString() {
        return "Circulo{" + 
                "Radio: " + radio + 
                '}';
    }
}
