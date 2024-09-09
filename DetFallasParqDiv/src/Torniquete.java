public class Torniquete {
    private int contadorPersonas;
    private boolean liberado;

    public Torniquete() {
        this.contadorPersonas = 0;
        this.liberado = true;
    }

    public void entrarPersona() {
        if (liberado) {
            contadorPersonas++;
        }
    }

    public void salirPersona() {
        if (contadorPersonas > 0) {
            contadorPersonas--;
        }
    }

    public int getContadorPersonas() {
        return contadorPersonas;
    }

    public void liberar() {
        liberado = true;
        System.out.println("Torniquete liberado.");
    }

    public void bloquear() {
        liberado = false;
        System.out.println("Torniquete bloqueado.");
    }
}
