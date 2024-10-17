package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Pruebas de las clases
 */
public class Main {
    public static void main(String[] args) {
        pruebaPersona();
        pruebaCoche();
        pruebaRectangulo();
        pruebaBanco();
        pruebasEmpleado();
        pruebaCuentaBancaria();
        pruebasLibro();
        pruebasAlumno();
        pruebasProducto();
        pruebasVehiculo();
        pruebasCirculo();
    }

    //Pruebas de la clase Persona
    public static void pruebaPersona() {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Maria", 25);

        System.out.println(persona1);
        System.out.println(persona2);

        persona2.setEdad(26);
        System.out.println("Edad actualizada de "+ persona2.getNombre() + ": " + persona2.getEdad());
    }

    //Pruebas de la clase Coche
    public static void pruebaCoche() {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022);
        Coche coche2 = new Coche("Ford", "Mustang", 1886);

        System.out.println(coche1);
        System.out.println(coche2);
    }

    //Pruebas de la clase Rectngulo
    public static void pruebaRectangulo(){
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        Rectangulo rectangulo2 = new Rectangulo(4, 7);

        System.out.println(rectangulo1);
        System.out.println("El area del rectangulo1 es: " + rectangulo1.calcularArea());
        System.out.println(rectangulo2);
        System.out.println("El perímetro del rectangulo2 es: " + rectangulo2.calcularPerimetro());
    }

    //Pruebas de la clase Banco
    public static void pruebaBanco(){
        Banco cuenta1 = new Banco(1000);

        System.out.println(cuenta1);

        cuenta1.depositarSaldo(500);
        cuenta1.retirarSaldo(200);

        System.out.println(cuenta1);
    }

    //Pruebas de la clase Empleado
    public static void pruebasEmpleado() {
        Empleado empleado1 = new Empleado("Ana", "Gerente", 5000);
        Empleado empleado2 = new Empleado("Carlos", "Ingeniero", 3000);

        System.out.println(empleado1);
        System.out.println(empleado2);
    }

    //Pruebas de la clase CuentaBancaria
    public static void pruebaCuentaBancaria() {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Pedro", 1500);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Laura", 1000);
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria("Luis", 500);
        CuentaBancaria cuentaBancaria4 = new CuentaBancaria("Sofía", 3000);

        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);
        System.out.println(cuentaBancaria3);
        System.out.println(cuentaBancaria4);

        cuentaBancaria1.transferenciaSaldo(cuentaBancaria2, 500);
        cuentaBancaria3.transferenciaSaldo(cuentaBancaria4, 500);

        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);
        System.out.println(cuentaBancaria3);
        System.out.println(cuentaBancaria4);
    }

    //Pruebas de la clase Libro
    public static void pruebasLibro() {
        Libro libro1 = new Libro("El Quijote", "Cervantes", 500);

        System.out.println(libro1);
    }

    //Pruebas de la clase Alumno
    public static void pruebasAlumno() {
        Alumno alumno1 = new Alumno("Lucía", 7);
        Alumno alumno2 = new Alumno("Jorge", 5);

        System.out.println('¿' + alumno1.getNombre() + " a aprobado? " + alumno1.aprobado());
        System.out.println('¿' + alumno2.getNombre() + " a aprobado? " + alumno2.aprobado());

        System.out.println(alumno1);
        System.out.println(alumno2);
    }

    //Pruebas de la clase Producto
    public static void pruebasProducto() {
        Producto producto1 = new Producto("Laptop", 1000, 50);
        Producto producto2 = new Producto("Cámara", 300, 20);

        System.out.println(producto2);

        producto2.venderProducto(5);

        System.out.println(producto1);
        System.out.println(producto2);
    }

    //Pruebas de la clase Vehiculo
    public static void pruebasVehiculo() {
        Vehiculo vehiculo1 = new Vehiculo("Honda", "Civic", 40);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Fiesta", 40);

        System.out.println(vehiculo1);
        System.out.println(vehiculo2);

        vehiculo2.repostarVehiculo(20);

        System.out.println(vehiculo2);

    }

    //Pruebas de la clase Circulo
    public static void pruebasCirculo() {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(10);

        System.out.println("El area del circulo1 es " + circulo1.calcularArea());
        System.out.println("El perimetro del circulo1 es " + circulo1.calcularPerimetro());

        System.out.println(circulo1);
        System.out.println(circulo2);
    }
}