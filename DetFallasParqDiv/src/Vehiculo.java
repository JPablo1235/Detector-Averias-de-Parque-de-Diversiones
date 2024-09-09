public class Vehiculo {
	
	/*Declarar atributos*/
	private boolean anclaje; // Identifica si el vehiculo está anclado o no
	private String id;		// Le da su identidad en caso de necesitar reparacion
	private Atraccion atraccion; // Se define la atraccion a la que pertenece el vehiculo
	
	/*Declarar constructor*/
	
	public Vehiculo(String id, boolean anclado, Atraccion atraccion) {
		this.id= id;
		this.anclaje = anclado;
		this.atraccion = atraccion;
	}
	
	/*Declarar metodos*/
	
	public boolean estadoAnclaje() { //Devuelve estado de anclaje del vehiculo, false si no lo está, true si lo está
		return anclaje;
	}
	
	public void setAnclaje(boolean anclaje) { //setter de anclaje de vehiculo
		this.anclaje = anclaje;
	}
	
	public String getId() { // devuelve el identificador del vehiculo
		return id;
	}
	
	public void setId(String id) { // Establece la identidad al vehiculo
		this.id = id;
	}

	public void verificarAnclaje(CentralReceptoraAverias cra) { // Se verifica que todos los vehiculos se encuentren anclados (true)
		if (!anclaje) {
			atraccion.solicitarRevision(this);
			cra.reportarFallo(this);
		}
		else {
			
		}
	
	}

	public Atraccion getAtraccion() { // Informa la atraccion perteneciente al vehiculo
		return atraccion;
	}
	
	
}
