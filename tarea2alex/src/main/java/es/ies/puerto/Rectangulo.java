package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.1.0
 * 
 * Ejercicio 5 Crea una clase llamada Rectangulo con los atributos base y altura. 
 * Implementa un método que calcule el área del rectángulo. Usa getters y setters 
 * para los atributos.
 * Crea un objeto de la clase Rectangulo con base 5 y altura 10. Muestra el área calculada del rectángulo.
 * 
 * Ejercicio 6 Añade un método en la clase Rectangulo que calcule el perímetro 
 * del rectángulo.
 * Crea un objeto de la clase Rectangulo con base 4 y altura 7. Muestra el perímetro calculado del rectángulo.
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    /**
     * Constructor por defecto
     */
    public Rectangulo() {}
    
    /**
     * Constructor completo
     * @param base
     * @param altura
     */
    public Rectangulo(int base, int altura){
        setBase(base);
        setAltura(altura);
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        validarBase(base);
        this.base = base;
    }

    public void setAltura(int altura) {
        validarAltura(altura);
        this.altura = altura;
    }

    private void validarBase(int base) {
        if (base < 0) {
            throw new IllegalArgumentException("La base no puede ser negativa.");
        }
    }

    private void validarAltura(int altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa.");
        }
    }

    public float calcularArea() {
        return (float) base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + 
                "Base: " + base +
                ", Altura: " + altura +
                '}';
    }
}