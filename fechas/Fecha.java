package fechas;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor vacío
    public Fecha() {}

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Getters y Setters
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String toString(){
        return dia+"/"+mes+"/"+año;
    }
    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;

        return ((this.dia ==otra.dia) && (this.mes ==otra.mes) && (this.año ==otra.año));
    }
}