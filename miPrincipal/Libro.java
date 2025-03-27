package miPrincipal;
import java.util.Date;
public class Libro extends Publicacion{
     //atributos
     private String isbn;
     private String autor;
     //constructores
     public Libro(){
         super();
 
     }
     public Libro(String isbn,String autor){
         super("sin definir",null);
         this.isbn = isbn;
         this.autor = autor;
     }
     public Libro(String editorial, Date fecha, String isbn, String autor){
         super(editorial, fecha);
         this.isbn = isbn;
         this.autor = autor;
 
     }
     //getter y setter
     public String getIsbn(){
         return this.isbn;
     }
     public void setIsbn(String isbn){
         this.isbn = isbn;
     }
     public String getAutor(){
         return this.autor;
     }
     public void setAutor(String autor){
         this.autor = autor;
     }
 
     @Override
     public String toString(){
         
         return " Autor: "+this.autor+" ISBN: "+this.isbn;
 
     }

}