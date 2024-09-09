public class Operario {
    private String nombre; // nombre del operario
    private boolean ocupado; // Estado del operario
    private DispositivoOperario dispositivo; // Dispositivo del operario
	private CentralReceptoraAverias cra; // Relacion con la CRA 

	/* Creacion del constructor*/
    public Operario(String nombre, DispositivoOperario dispositivo, CentralReceptoraAverias cra, boolean ocupado) {
        this.nombre = nombre;
        this.ocupado = ocupado;
        this.dispositivo = dispositivo;
        this.cra = cra;
        dispositivo.setOperario(this);

    }

    public boolean estado() { // Devuelve el estado del operario
        return ocupado;
    }

    public void atenderAveria(Vehiculo vehiculo) { // El operario atenderá la averia del vehiculo que se presente
        ocupado = true;
        dispositivo.atenderAveria(vehiculo); // El dispositivo le notifica 
    }

    public void finalizarRevision(Atraccion atraccion, Vehiculo vehiculo) { // Termina la revision 
        ocupado = false; // Se pone disponible para el siguiente trabajo
    }

	public String getNombre() { // getter del nombre del operario
		return(nombre);
	}
    
}
