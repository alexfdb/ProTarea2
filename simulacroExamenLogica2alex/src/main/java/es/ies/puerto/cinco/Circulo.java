package es.ies.puerto.cinco;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 5 Crea una clase llamada Círculo que represente un círculo. Debe de 
 * poseer como atributo su radio, del cual vamos a obtener el perímetro de este.
 * 
 * Crear una instancia de la clase Círculo con un radio de 5.
 * Muestra el valor de circulo.
 * Mostrar el área y el perímetro del círculo.
 * Modificar el radio a 7 y mostrar nuevamente el área y el perímetro.
 * Muestra el valor de circulo.
 */
public class Circulo {

    private float radio;

    /**
     * Constructor por defecto
     */
    public Circulo() {
        this.radio = 0.0f;
    }

    /**
     * Constructor completo
     * @param radio
     */
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
            throw new IllegalArgumentException("El radio no puede ser cero o tener un valor negativo");
        }
    }

    /**
     * Método que retorna el perimetro de un círculo
     * @return
     */
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * radio);
    }

    @Override
    public String toString() {
        return "Círculo{" + 
               "Radio: " + radio +
               '}';
    }
    
    /**
     * Método para probar la clase Circulo
     * @param args
     */
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);

        System.out.println(circulo1);

        System.out.println("El perímetro del circulo1 es: " + circulo1.calcularPerimetro());

        circulo1.setRadio(7);

        System.out.println("El perímetro del circulo1 es: " + circulo1.calcularPerimetro());

        System.out.println(circulo1);
    }
}