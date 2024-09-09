import java.util.ArrayList;
import java.util.List;

public class CentralReceptoraAverias {
    private List<Vehiculo> vehiculosConFallo;
    private List<Operario> operarios;
    private Atraccion atraccion;
    
    public CentralReceptoraAverias() {
        this.vehiculosConFallo = new ArrayList<>();
        this.operarios = new ArrayList<>();
        
    }

    public void agregarOperario(Operario operario) {
        operarios.add(operario);
    }

    public void reportarFallo(Vehiculo vehiculo) {
        vehiculosConFallo.add(vehiculo);
        System.out.println("Se reporta fallo en el vehículo: " + vehiculo.getId()+ "en la ubicacion " + vehiculo.getAtraccion().getUbicacion());
        asignarOperario(vehiculo);
    }

    public List<Vehiculo> getVehiculosConFallo() {
        return vehiculosConFallo;
    }

    public void asignarOperario(Vehiculo vehiculo) {
        for (Operario operario : operarios) {
            if (!operario.estado()) {
                operario.atenderAveria(vehiculo);
                return;
            }
        }
        System.out.println("No hay operarios disponibles para atender el fallo en el vehículo " + vehiculo.getId());
    }

	public void repararVehiculo(Vehiculo vehiculo, Operario operario) {
		System.out.println("Activando vehiculo...");
		vehiculo.setAnclaje(true);
		operario.finalizarRevision(atraccion, vehiculo);
	}

	public void getOperarios() {
		
		for (Operario operario : operarios) {
			System.out.println(operario.getNombre()+ " " + operario.estado());
		}
		
	}
}

