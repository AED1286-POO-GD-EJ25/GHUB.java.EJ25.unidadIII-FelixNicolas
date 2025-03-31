package miPrincipal;
import ventana.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ventana.Ventana;

public class Principal {
    public static void main(String[] args) {
        // Formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Crear objetos Publicacion
            Publicacion publicacion = new Publicacion();
            publicacion.setEditorial("McGrawnHill");
            publicacion.setFecha(sdf.parse("01/01/1989"));

            // Crear un objeto Libro
            Libro libro = new Libro();
            Libro libro1 = new Libro("121212121", "Gabriel Garcia Marquez");
            Libro libro2 = new Libro("AlfaOmega", sdf.parse("12/05/2001"), "323423423", "Ines Arredondo");

            // Crear un objeto Revista
            Revista revista = new Revista();
            revista.setEditorial("Porrua");
            revista.setFecha(sdf.parse("27/01/2025"));
            revista.setPeriodicidad("anual");
            revista.setEjemplares(1500);

            // Imprimir
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
            ventanaEspecial.copiar('*', 100, 7.5, 8.5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
