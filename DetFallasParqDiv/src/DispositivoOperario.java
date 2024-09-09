public class DispositivoOperario {
	
    private Operario operario;
    private CentralReceptoraAverias cra;

    public DispositivoOperario(Operario operario, CentralReceptoraAverias cra) {
        this.operario = operario;
        this.cra = cra;
    }

    public void atenderAveria(Vehiculo vehiculo) {
        System.out.println("Operario " + operario.getNombre() + " está atendiendo la avería del vehículo " + vehiculo.getId());
        finalizarRevision();
    }

    public void finalizarRevision() {
        System.out.println("Operario " + operario.getNombre() + " ha finalizado la revisión.");
        Vehiculo vehiculo = cra.getVehiculosConFallo().get(0); // Obtener el primer vehículo con fallo
        cra.repararVehiculo(vehiculo, operario);
    }
    
    public void setOperario(Operario operario) {
        this.operario = operario;
    }
    
}
