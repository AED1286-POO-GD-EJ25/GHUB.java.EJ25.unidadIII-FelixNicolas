package fechas;
public class TestFecha{
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAño(2000);

        System.out.println(f.toString());
    }
}