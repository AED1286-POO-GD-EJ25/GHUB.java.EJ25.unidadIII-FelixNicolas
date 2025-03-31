public class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor vacío
    public EmpleadoPorHoras() {}

    // Constructor lleno
    public EmpleadoPorHoras(String nombre, int edad, String tipoRelacionLaboral, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, edad, tipoRelacionLaboral);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters y Setters
    public double getTarifaPorHora() { return tarifaPorHora; }
    public void setTarifaPorHora(double tarifaPorHora) { this.tarifaPorHora = tarifaPorHora; }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }
}