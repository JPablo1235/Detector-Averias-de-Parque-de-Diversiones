import java.util.ArrayList;
import java.util.List;

public class Atraccion { // Clase Base
    private String nombre;
    private String ubicacion;
    private List<Vehiculo> vehiculos;
    private int averiasPendientes;  // Contador de averías

    public Atraccion(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.vehiculos = new ArrayList<>();	//Inicializa lista de vehiculos
        this.averiasPendientes = 0;  // Inicializar averías pendientes a 0
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void verificarAnclajes(CentralReceptoraAverias cra) {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.verificarAnclaje(cra);
        }
    }

    public void solicitarRevision(Vehiculo vehiculo) {
        averiasPendientes++;  // Incrementar el contador de averías
        System.out.println(nombre + " en " + ubicacion + " ha solicitado revisión para el vehículo: " + vehiculo.getId());
    }

    public void mantenimientoCompletado(Vehiculo vehiculo) {
        if (averiasPendientes > 0) {
        	
            averiasPendientes--;  // Disminuir el contador de averías
            System.out.println("Mantenimiento completado para el vehículo: " + vehiculo.getId() + " en " + ubicacion);
        }
    }

    public int contarAveriasPendientes() { // Contador de averias en la atraccion
        return averiasPendientes;
    }

    public String getNombre() { // Devuelve el nombre de la atraccion
        return nombre;
    }

    public String getUbicacion() { // Devuelve la ubicacion de la atraccion (calle)
        return ubicacion;
    }
    public void repararVehiculo() {
            if (averiasPendientes > 0) {
                averiasPendientes--;
            }
        }
    public void iniciar() {
            System.out.println("La atracción " + nombre + " ha iniciado.");
    }
    
    public void finalizar() {
        System.out.println("La atracción " + nombre + " ha finalizado.");
    }
    public void imprimirVehiculos() {
        
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("ID: " + vehiculo.getId() + ", Anclado: " + vehiculo.estadoAnclaje() + ", Atracción: " + vehiculo.getAtraccion().getNombre());
            }
         
    }
}

