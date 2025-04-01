package fechas;
import java.util.Scanner;
public class TestFecha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Fecha1 (dia, mes y año)");
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int año1 = scanner.nextInt();
        
        Fecha f1 = new Fecha(dia1, mes1, año1);

        System.out.println("Ingrese Fecha2 (dia, mes y año)");
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int año2 = scanner.nextInt();
        
        Fecha f2 = new Fecha(dia2, mes2, año2);

        if(f1.equals(f2)){
            System.out.println("son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }

}
