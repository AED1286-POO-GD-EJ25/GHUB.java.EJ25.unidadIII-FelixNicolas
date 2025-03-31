public class Empleado {
    protected String nombre;
    protected int edad;
    protected String tipoRelacionLaboral;

    public Empleado(){
    }
    public Empleado(String nombre, int edad, String tipoRelacionLaboral) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoRelacionLaboral = tipoRelacionLaboral;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de relación laboral: " + tipoRelacionLaboral);
    }
}
