package miPrincipal;
import ventana.*;
import java.util.Date;

import ventana.Ventana;

public class Principal {
   

    public static void main(String[] args) {
        //crear objetos publicacion
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGrawnHill");
        publicacion.setFecha(new Date("01/01/1989"));

        //crear un objeto Libro
        Libro libro = new Libro();
        Libro libro1 = new Libro("121212121","Gabriel Garcia Marquez");
        Libro libro2 = new Libro("AlfaOmega", new Date("12/05/2001"), "323423423","Ines Arredondo");

        //crea un objeto Revista
        Revista revista= new Revista();
        revista.setEditorial("Porrua");
        revista.setFecha(new Date("27/01/2025"));
        revista.setPeriodicidad("anual");
        revista.setEjemplares(1500);

        //imprimir

        System.out.println(publicacion);
        System.out.println();

        System.out.println(libro);
        System.out.println(libro1.toString());
        System.out.println(libro2);
        System.out.println();

        System.out.println(revista);

       Ventana ventana = new Ventana();
       VentanaEspecial ventanaEspecial = new VentanaEspecial();
       ventanaEspecial.copiar(ventanaEspecial);
       ventanaEspecial.copiar("*****", 10, 5);
        ventanaEspecial.copiar('*', 100, 7, 8);
        ventanaEspecial.copiar('*', 100, 7.5, 8,5);
    }
}