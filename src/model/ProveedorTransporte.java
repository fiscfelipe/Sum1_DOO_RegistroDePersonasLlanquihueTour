package model;
/**
 * Clase que representa una Persona que es Proveedor de Transporte para LlanquihueTour
 * 
 * Esta clase hereda de la clase Persona, ya que todos los Proveedores de Transporte son Personas
 * * Esta clase utiliza composición, ya que todo Proveedor de transporte, registra una patente
 */
public class ProveedorTransporte extends Persona {

    //Atributos propios
    private String tipoVehiculo;
    private Patente patenteVehiculo;
    private int asientosDisponibles;

    /**
     * Constructor de la clase ProveedorTransporte 
     * 
     * @param nombre                        Nombre del Proveedor de Transporte
     * @param rut                           Rut del Proveedor de Transporte
     * @param correo                        Correo electrónico del Proveedor de Transporte
     * @param direccion                     Dirección del domicilio del Proveedor de Transporte
     * @param tipoVehiculo                  Tipo de vehículo que maneja el Proveedor de Transporte
     * @param patenteVehiculo               Patente del vehículo que maneja el Proveedor de Transporte
     * @param asientosDisponibles           Asientos disponibles que tiene en su vehiculo el Proveedor de Transporte
     */
    public ProveedorTransporte( String nombre, Rut rut, Correo correo, Direccion direccion, String tipoVehiculo, Patente patenteVehiculo, int asientosDisponibles) {

        super(nombre, rut, correo, direccion);

        this.tipoVehiculo = tipoVehiculo;
        this.patenteVehiculo = patenteVehiculo;
        this.asientosDisponibles = asientosDisponibles;
    }

    //Setters
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setPatenteVehiculo(Patente patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    //Getters
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public Patente getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    //Métodos
    
    /**
     * Sobreescribe el método toString()
     * @return lo mismo que el toString() de persona más sus atributos propios anexados
     */
    @Override
    public String toString() {

        return super.toString() +
                "\nTipo vehiculo: " + tipoVehiculo +
                "\nPatente vehiculo: " + patenteVehiculo +
                "\nAsientos disponibles: " + asientosDisponibles;
    }
}