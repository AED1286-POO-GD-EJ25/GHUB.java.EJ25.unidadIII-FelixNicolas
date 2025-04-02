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

    public Fecha(String s){
        int pos1 = s.indexOf('/'); // Posición del primer '/'
        int pos2 = s.indexOf('/', pos1 + 1); // Posición del segundo '/'

        String sDia = s.substring(0, pos1);
        this.dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1 + 1, pos2);
        this.mes = Integer.parseInt(sMes);

        String sAño = s.substring(pos2 + 1);
        this.año = Integer.parseInt(sAño);
    }
    private int fechaToDias(){
        return año*360+mes*30+dia;
    }
    private void diasToFecha(int i){
        this.año = (int)i/360;
        int resto = i%360;

        this.mes =(int)resto/30;
        this.dia=resto%30;
        if(dia==0){
            dia=30;
            mes--;
        }

        if(mes ==0){
            mes=12;
            año--;
        }
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