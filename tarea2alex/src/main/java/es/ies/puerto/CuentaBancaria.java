package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 10 Crea una clase CuentaBancaria con los atributos titular y saldo. 
 * Implementa un método para transferir dinero entre dos cuentas.
 * Crea dos objetos de la clase CuentaBancaria con titulares "Pedro" y "Laura", 
 * y con saldo inicial de 1500 y 1000 respectivamente. Transfiere 500 de la cuenta 
 * de Pedro a la cuenta de Laura y muestra los saldos de ambas cuentas.
 * 
 * Ejercicio 11 Modifica la clase CuentaBancaria para que la transferencia no 
 * pueda realizarse si el saldo de la cuenta es insuficiente.
 * Crea dos objetos de la clase CuentaBancaria con titulares "Luis" y "Sofía", 
 * con saldos de 500 y 3000 respectivamente. Intenta transferir 1000 de la cuenta 
 * de Luis y muestra un mensaje de saldo insuficiente.
 */
public class CuentaBancaria {
    private String titular;
    private float saldo;

    /**
     * Constructor por defecto
     */
    public CuentaBancaria() {}

    /**
     * Constructor completo
     * @param titular Nombre
     * @param saldo Cantidad
     */
    public CuentaBancaria(String titular, float saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        validarTitular(titular);
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        validarSaldo(saldo);
        this.saldo = saldo;
    }

    public void validarTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser null o estar vacío");
        }
    }

    public void validarSaldo(float saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede estar en negativo");
        }
    }

    /**
     * @param cuentaDestino
     * @param cantidad
     */
    public void transferenciaSaldo(CuentaBancaria cuentaDestino, float cantidad) {
        if (cuentaDestino == null) {
            throw new IllegalArgumentException("La cuenta de destino no puede ser null");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a transferir debe ser positiva");
        }
        if (this.saldo < cantidad) {
            throw new IllegalArgumentException("Saldo insuficiente para la transferencia");
        }

        this.saldo -= cantidad;
        cuentaDestino.saldo += cantidad;
    }

    /**
     * 
     * @param cantidad
     */
    public void depositar(float cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva");
        }
        this.saldo += cantidad;
    }

    /**
     * 
     * @param cantidad
     */
    public void retirar(float cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva");
        }
        if (this.saldo < cantidad) {
            throw new IllegalArgumentException("Saldo insuficiente para la retirada");
        }

        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {" + 
                "Titular: " + titular + 
                ", Saldo: " + String.format("%.2f", saldo) + 
                '}';
    }

}