
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.text.DateFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    class ComparatorProjecto implements Comparable<ComparatorProjecto>{
  public long fechaProjecto;
  public String nombre;
 ComparatorProjecto(String nombre,long fechaProjecto){
  this.fechaProjecto = fechaProjecto;
  this.nombre = nombre;
 }

        public String getNombre() {
            return nombre;
        }

        public long getFechaProjecto() {
            return fechaProjecto;
        }

        public void setFechaProjecto(long fechaProjecto) {
            this.fechaProjecto = fechaProjecto;
        }
@Override
 public String toString(){

    Date currentDate = new Date(fechaProjecto);
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss ");
    return "Proyecto: "+nombre + "   Creado: " + sdf.format(currentDate);
 }
    

 @Override
 public int compareTo(ComparatorProjecto p) {
 return Long.compare(this.fechaProjecto, p.fechaProjecto);
 }
    }
    
     class Proyecto {
    
    TreeMap<String, Anotacion> asunto;
    String nombre;
    String descripcion;
    long fechaProjecto;
    
    
    public Proyecto(String nombre, String descripcion) throws ParseException{
        
        asunto = new TreeMap<String, Anotacion>();
        this.nombre = nombre;
        this.descripcion = descripcion;
        Date date = new Date();
        this.fechaProjecto = date.getTime();
        
    }
    
    public void addAnotaciones(String nombre, Anotacion anotacion){
        
        this.asunto.put(nombre, anotacion);
        
    }
    
    @Override
    public String toString(){
        
        return "" + asunto;
    }
    
}
     class Anotacion{
    
    String cabecera;
    String cuerpo;
    Date fecha;
    
    public Anotacion(String cabecera, String cuerpo){
    
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
        fecha = new Date();
    }
    
    @Override
    public String toString(){
        
        return "Fecha: " + fecha+ "\nCabecera: "+cabecera + "\nCuerpo: "+cuerpo;
        
    }
}
     
     
     
     
  
    
}
/*class Main{
    // public static void main(String[] args) {
      //Proyecto a = new Proyecto("A","el primer proyecto");
       
    }
}
 */