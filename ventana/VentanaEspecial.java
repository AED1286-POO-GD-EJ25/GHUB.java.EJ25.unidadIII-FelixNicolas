package ventana;
public class VentanaEspecial extends Ventana{

    public void copiar(char c, int veces, int x, int y){
        System.out.println("metodo especial");

    }
    public void copiar(char c, int veces, double x, double y){
        System.out.println("metodo especial");

    }

    public void copiar(Ventana w){
        System.out.println("metodo copiar 1 argumento clase derivada");

    }
}