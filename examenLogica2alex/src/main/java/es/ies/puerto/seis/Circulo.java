package es.ies.puerto.seis;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea una clase llamada Círculo que represente un círculo. Debe de poseer 
 * como atributo su radio, para obtener el perímetro de este.
 */
public class Circulo {
    private float radio;

    /**
     * Constructor por defecto
     */
    public Circulo(){
        radio = 0.0f;
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

    /**
     * Metodo para validar que el radio no sea cero ni tenga un valor negativo.
     * @param radio
     */
    public void validarRadio(float radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio no puede ser cero ni tener un valor negativo.");
        }
    }

    /**
     * Metodo para calcular el perimetro de un circulo.
     * @return
     */
    public float calcularPerimetro() {
        return (float) (2 * Math.PI) * radio;
    }

    public String toString() {
        return "Circulo{" + 
               "Radio: " + radio + 
               '}'; 
    }
    
}
