public class EmpleadoComision extends Empleado {
    private double comision;
    private int ventasRealizadas;

    // Constructor vacío
    public EmpleadoComision() {}

    // Constructor lleno
    public EmpleadoComision(String nombre, int edad, String tipoRelacionLaboral, double comision, int ventasRealizadas) {
        super(nombre, edad, tipoRelacionLaboral);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }

    // Getters y Setters
    public double getComision() { return comision; }
    public void setComision(double comision) { this.comision = comision; }

    public int getVentasRealizadas() { return ventasRealizadas; }
    public void setVentasRealizadas(int ventasRealizadas) { this.ventasRealizadas = ventasRealizadas; }
}