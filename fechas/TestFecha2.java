package fechas;
import java.util.Scanner;
public class TestFecha2{
    public static void main(String []args){
        System.out.println("Ingresa fecha (dd/mm/aa)");
        Scanner scan = new Scanner(System.in);
        String fecha = scan.nextLine();
        Fecha f = new Fecha(fecha);
        System.out.println("Hoy es "+f);

        
    }
}