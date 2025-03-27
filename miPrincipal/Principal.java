package miPrincipal;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGrawHill");
        publicacion.setFecha(new Date("01/01/2000"));

        Libro libro = new Libro();  
        Libro libro1 = new Libro("21323313", "Sheakspeare");  
        Libro libro2 = new Libro("Harry", new Date(12/01/2010));
        
        Revista revista = new Revista();
        revista.setEditorial("SEP");
        revista.setFecha(new DateFormat.parse("22/01/2022"));
        revista.setPeriodicidad("anual");
        revista.setEjemplares(2000);
    }
}