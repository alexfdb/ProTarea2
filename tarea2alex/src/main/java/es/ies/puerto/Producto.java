package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 15 Crea una clase Producto con los atributos nombre, precio y stock. 
 * El precio no puede ser negativo y el stock debe ser al menos 0.
 * Crea un objeto de la clase Producto con nombre "Laptop", precio 1000, y stock 50. 
 * Asegúrate de que el precio no sea negativo y que el stock no sea menor a 0.
 * 
 * Ejercicio 16 Añade a la clase Producto un método para vender productos, que 
 * disminuya el stock y retorne el total de la venta.
 * Crea un objeto de la clase Producto con nombre "Cámara", precio 300, y stock 20. 
 * Realiza una venta de 5 unidades y muestra el stock restante y el total de la venta.
 */
public class Producto {
    
    private String nombre;
    private float precio;
    private int stock;

    /**
     * Constructor por defecto
     */
    public Producto() {}

    /**
     * Constructor completo
     * 
     * @param nombre
     * @param precio
     * @param stock
     */
    public Producto(String nombre, float precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        validarPrecio(precio);
        this.precio = precio;
    }

    public void setStock(int stock) {
        validarStock(stock);
        this.stock = stock;
    }

    public void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacío");
        }
    }

    public void validarPrecio(float precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede tener un valor negativo");
        }
    }

    public void validarStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede tener un valor negativo");
        }
    }

    /**
     * @param cantidad
     */
    public void venderProducto(int cantidad) {
        if (this.stock < cantidad) {
            throw new IllegalArgumentException("La cantidad a vender no puede ser mayor al stock del producto");
        }
        this.stock -= cantidad;
        float costoVenta = cantidad * this.precio;
        System.out.println("Se ha vendidio un total de " + cantidad + " unidades, del producto " + nombre + " por un precio total de " + String.format("%.2f", costoVenta) + " $.");
    }

    @Override
    public String toString() {
        return "Producto{" + 
                "Nombre: " + nombre +
                ", Precio: " + String.format("%.2f", precio) + 
                ", Stock: " + stock +
                '}';
    }
}
