package model;

/**
 * Clase que representa a una Persona que es un Proveedor de Alojamiento para LlanquihueTour
 * 
 * Esta clase hereda de la clase Persona, ya que todos los Proveedores de Alojamiento son personas
 * Esta clase utiliza composición, ya que todo alojamiento tiene una dirección
 */
public class ProveedorAlojamiento extends Persona {

    //Atributos propios
    private String alojamiento;
    private int habitacionesDisponibles;
    private Direccion direccionAlojamiento;

    /**
     * Constructor de la clase ProveedorAlojamiento
     * 
     * @param nombre                        Nombre del Proveedor De Alojamiento
     * @param rut                           Rut del Proveedor De Alojamiento
     * @param correo                        Correo del del Proveedor De Alojamiento
     * @param direccion                     Dirección del del Proveedor De Alojamiento
     * @param alojamiento                   Nombre del alojamiento del Proveedor De Alojamiento
     * @param habitacionesDisponibles       Habitaciones disonibles con las que cuenta el Proveedor De Alojamiento
     * @param direccionAlojamiento          Dirección del Alojamiento que administra el Proveedor De Alojamiento
     */
    public ProveedorAlojamiento( String nombre, Rut rut, Correo correo, Direccion direccion, String alojamiento, int habitacionesDisponibles, Direccion direccionAlojamiento) {

        super(nombre, rut, correo, direccion);

        this.alojamiento = alojamiento;
        this.habitacionesDisponibles = habitacionesDisponibles;
        this.direccionAlojamiento = direccionAlojamiento;
    }

    //Setters
    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setHabitacionesDisponibles(int habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public void setDireccionAlojamiento(
            Direccion direccionAlojamiento) {

        this.direccionAlojamiento = direccionAlojamiento;
    }

    //Getters
    public String getAlojamiento() {
        return alojamiento;
    }

    public int getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public Direccion getDireccionAlojamiento() {
        return direccionAlojamiento;
    }

    //Métodos
    

    @Override
    public String toString() {

        return super.toString() +
                "\nAlojamiento: " + alojamiento +
                "\nHabitaciones disponibles: " + habitacionesDisponibles +
                "\nDireccion alojamiento: " + direccionAlojamiento;
    }
}