package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 12 Crea una clase Libro con los atributos titulo, autor y paginas. Usa getters 
 * y setters para cada atributo, y asegura que el número de páginas sea un entero positivo.
 * Crea un objeto de la clase Libro con título "El Quijote", autor "Cervantes", y 500 páginas. 
 * Asegúrate de que el número de páginas sea positivo.
 */

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Constructor por defecto
     */
    public Libro() {}

    public Libro(String titulo, String autor, int paginas) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        validarTitulo(titulo);
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        validarAutor(autor);
        this.autor = autor; 
    }

    public void setPaginas(int paginas) {
        validarPaginas(paginas);
        this.paginas = paginas;
    } 

    public void validarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede ser null o estar vacío");
        }
    }

    public void validarAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede ser null o estar vacío");
        }
    }

    public void validarPaginas(int paginas) {
        if(paginas <= 0) {
            throw new IllegalArgumentException("Las paginas no pueden ser igual o menor a cero");
        }
    }

    public String toString() {
        return "Libro{" + 
                "Titulo: " + titulo +
                ", Autor: " + autor +
                ", Paginas: " + paginas + 
                '}';
    }
}
