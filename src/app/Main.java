package app;
import model.*;
import util.*;

public class Main {

    public static void main(String[] args) {
        
        try {

            //Persona
            Persona persona = new Persona("Carlos Muñoz", new Rut("12345678-9"), new Correo("carlos@gmail.com"), new Direccion("San Martin", 123, "Llanquihue", "Los Lagos"));

            // Proveedor de Transporte
            ProveedorTransporte proveedorTransporte = new ProveedorTransporte("Juan Perez",new Rut("87654321-K"), new Correo("juan@hotmail.com"), new Direccion("Los Alerces", 456, "Puerto Varas", "Los Lagos"), "Van", new Patente("ABCD12"), 12);

            // Proveedor de Alojamiento
            ProveedorAlojamiento proveedorAlojamiento = new ProveedorAlojamiento("Maria Soto",new Rut("11222333-4"), new Correo("maria@live.cl"), new Direccion("Costanera", 789, "Frutillar", "Los Lagos"), "Hostal Die Oma", 15, new Direccion("Costanera", 800, "Frutillar", "Los Lagos"));

            
            System.out.println("=== EJEMPLO PERSONA ===");
            System.out.println(persona);

            System.out.println("\n=== EJEMPLO PROVEEDOR TRANSPORTE ===");
            System.out.println(proveedorTransporte);

            System.out.println("\n=== EJEMPLO PROVEEDOR ALOJAMIENTO ===");
            System.out.println(proveedorAlojamiento);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        RegistroHelper.iniciar();
    }
}