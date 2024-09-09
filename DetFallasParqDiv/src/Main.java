public class Main {
    public static void main(String[] args) {
    	// Crear CRA
    	CentralReceptoraAverias cra = new CentralReceptoraAverias();
    	
    	// Crear operarios con dispositivos
    	DispositivoOperario dispositivo1 = new DispositivoOperario(null, cra);
    	DispositivoOperario dispositivo2 = new DispositivoOperario(null, cra);

		Operario operario1 = new Operario("Juan Sanchez ", dispositivo1, cra, true);
    	Operario operario2 = new Operario("Pablo Nieto ", dispositivo2, cra, true);
    	
    	// Guardando operarios en lista
    	
    	cra.agregarOperario(operario1);
        cra.agregarOperario(operario2);

        // Creando Noria
        
        Noria noria = new Noria("Super Noria", "Calle 1");
        
        // Crear vehiculo para la Noria 
        
        Vehiculo vehiculo1 = new Vehiculo("Vehiculo_noria 1", false, noria);
        Vehiculo vehiculo2 = new Vehiculo("Vehiculo_noria 2", false, noria);
        
        // Añadir vehiculos a Noria
        
        noria.agregarVehiculo(vehiculo1);
        noria.agregarVehiculo(vehiculo2);
        
        // Creando montaña rusa
        
        MontanaRusa montanarusa = new MontanaRusa("Montaña de la muerte", "Calle 5");
        
        // Crear vehiculo para la Montaña Rusa
        
        Vehiculo vehiculo3 = new Vehiculo("Vehiculo_mr 1",  false, montanarusa);
        Vehiculo vehiculo4 = new Vehiculo("Vehiculo_mr 2", false, montanarusa);
        
        // Añadir vehiculos a la MR
        
        montanarusa.agregarVehiculo(vehiculo3);
        montanarusa.agregarVehiculo(vehiculo4);
        
        cra.getOperarios();
        
        // Verificar anclaje de vehiculos
        
        noria.verificarAnclajes(cra);
        montanarusa.verificarAnclajes(cra);
        
        
        // Inicia la atraccion
        
        
        // Finaliza despues de un tiempo
        
    }
}
