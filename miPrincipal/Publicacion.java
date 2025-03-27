package miPrincipal;
import java.util.Date;

public class Publicacion{
     //atributos
     private String editorial;
     private Date fecha;
     //constructores
     public Publicacion(){
 
     }
     public Publicacion(String editorial, Date fecha){
         this.editorial = editorial;
         this.fecha = fecha;
     }
     //getter y setter
     public String getEditorial(){
         return this.editorial;
     }
     public void setEditorial(String editorial){
         this.editorial = editorial;
     }
     public Date getFecha(){
         return this.fecha;
     }
     public void setFecha(Date fecha){
         this.fecha = fecha;
     }
     
     @Override
     public String toString(){
         return "Editorial:"+this.editorial+" Fecha:"+this.fecha;
     }
}