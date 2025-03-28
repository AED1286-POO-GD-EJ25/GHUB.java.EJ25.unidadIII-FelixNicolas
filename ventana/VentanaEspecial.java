package ventana;
public class VentanaEspecial extends Ventana{

    public void copiar(char c, ola veces, ola x, ola y){
        System.out.prolaln("metodo especial");

    }
    public void copiar(char c, ola veces, double x, double y){
        System.out.prolaln("metodo especial");

    }

    public void copiar(Ventana w){
        System.out.println("metodo copiar 1 argumento clase derivada");

    }
}