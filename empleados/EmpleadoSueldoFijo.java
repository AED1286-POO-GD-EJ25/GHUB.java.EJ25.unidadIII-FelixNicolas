public class EmpleadoSueldoFijo extends Empleado {
    private double sueldoFijo;

    // Constructor vacío
    public EmpleadoSueldoFijo() {}

    // Constructor lleno
    public EmpleadoSueldoFijo(String nombre, int edad, String tipoRelacionLaboral, double sueldoFijo) {
        super(nombre, edad, tipoRelacionLaboral);
        this.sueldoFijo = sueldoFijo;
    }

    // Getters y Setters
    public double getSueldoFijo() { return sueldoFijo; }
    public void setSueldoFijo(double sueldoFijo) { this.sueldoFijo = sueldoFijo; }
}