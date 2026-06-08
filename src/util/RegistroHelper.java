package util;

import java.util.Scanner;

import model.*;

public class RegistroHelper {

    /**
     * Muestra una interfaz básica a través de la consola para desplegar el menú inicial
     */
    public static void iniciar() {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== REGISTRO DE PERSONAS LLANQUIHUE TOUR ===");
            System.out.println("1. Registrar proveedor transporte");
            System.out.println("2. Registrar proveedor alojamiento");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    registrarProveedorTransporte(scanner);
                    break;

                case 2:
                    registrarProveedorAlojamiento(scanner);
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);

        scanner.close();
    }

    /**
     * Utiliza los datos ingresados para registrar un Proveedor de Transporte
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     */
    private static void registrarProveedorTransporte(Scanner scanner) {

        System.out.println("\n=== REGISTRO PROVEEDOR TRANSPORTE ===");

        Rut rut = solicitarRut(scanner);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        Correo correo = solicitarCorreo(scanner);

        System.out.println("\nDireccion del proveedor:");

        Direccion direccion =
                solicitarDireccion(scanner);

        System.out.print("Tipo de vehiculo: ");
        String tipoVehiculo = scanner.nextLine();

        Patente patente = solicitarPatente(scanner);

        System.out.print("Asientos disponibles: ");
        int asientosDisponibles = scanner.nextInt();
        scanner.nextLine();

        ProveedorTransporte proveedor = new ProveedorTransporte(nombre, rut, correo, direccion, tipoVehiculo, patente, asientosDisponibles);

        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println(proveedor);
    }

    /**
     * Utiliza los datos ingresados para registrar un Proveedor de Alojamiento
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     */
    private static void registrarProveedorAlojamiento(
            Scanner scanner) {

        System.out.println("\n=== REGISTRO PROVEEDOR ALOJAMIENTO ===");

        Rut rut = solicitarRut(scanner);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        Correo correo = solicitarCorreo(scanner);

        System.out.println("\nDireccion del proveedor:");

        Direccion direccionProveedor =
                solicitarDireccion(scanner);

        System.out.print("Nombre alojamiento: ");
        String alojamiento = scanner.nextLine();

        System.out.print("Habitaciones disponibles: ");
        int habitacionesDisponibles = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDireccion del alojamiento:");

        Direccion direccionAlojamiento = solicitarDireccion(scanner);

        ProveedorAlojamiento proveedor =new ProveedorAlojamiento(nombre, rut, correo, direccionProveedor, alojamiento, habitacionesDisponibles, direccionAlojamiento);

        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println(proveedor);
    }
    
    /**
     * Solicita un rut al usuario hasta que este le entregue uno válido
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     * @return el RUT ingresado
     */
    private static Rut solicitarRut(Scanner scanner) {

        while (true) {

            try {
                System.out.print("Rut: ");
                return new Rut(scanner.nextLine());

            } catch (RutInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    /**
     * Solicita un correo electrónico al usuario hasta que este le entregue uno válido
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     * @return el correo electrónico ingresado
     */
    private static Correo solicitarCorreo(Scanner scanner) {

        while (true) {

            try {

                System.out.print("Correo: ");
                return new Correo(scanner.nextLine());

            } catch (CorreoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Solicita una patente al usuario hasta que este le entregue uno válido
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     * @return la patente ingresada
     */
    private static Patente solicitarPatente(Scanner scanner) {

        while (true) {

            try {
                System.out.print("Patente vehiculo: ");
                return new Patente(scanner.nextLine());

            } catch (PatenteInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Solicita una dirección al ususario
     * @param scanner Objeto scanner utilizado para captar los datos ingresados por el usuario
     * @return la dirección ingresada
     */
    private static Direccion solicitarDireccion(
            Scanner scanner) {

        System.out.print("Calle: ");
        String calle = scanner.nextLine();

        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Region: ");
        String region = scanner.nextLine();

        return new Direccion(calle,numero,ciudad,region);
    }
}