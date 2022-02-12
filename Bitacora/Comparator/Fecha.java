
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
 * @author nathan
 */
public class Fecha {

}

/**
 * @param args the command line arguments
 */
class ComparatorProyecto implements Comparable<ComparatorProyecto> {

    public long fechaProyecto;
    public String nombre;

    ComparatorProyecto(String nombre, long fechaProyecto) {
        this.fechaProyecto = fechaProyecto;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public long getFechaProyecto() {
        return fechaProyecto;
    }

    public void setFechaProyecto(long fechaProyecto) {
        this.fechaProyecto = fechaProyecto;
    }

    @Override
    public String toString() {

        Date currentDate = new Date(fechaProyecto);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss ");
        return "Proyecto: " + nombre + "   Creado: " + sdf.format(currentDate);
    }

    @Override
    public int compareTo(ComparatorProyecto p) {
        return Long.compare(this.fechaProyecto, p.fechaProyecto);
    }
}

class Proyecto {

    TreeMap<String, Anotacion> asunto;
    String nombre;
    String descripcion;
    long fechaProjecto;

    public Proyecto(String nombre, String descripcion) throws ParseException {

        asunto = new TreeMap<String, Anotacion>();
        this.nombre = nombre;
        this.descripcion = descripcion;
        Date date = new Date();
        this.fechaProjecto = date.getTime();

    }

    public void addAnotaciones(String nombre, Anotacion anotacion) {

        this.asunto.put(nombre, anotacion);

    }

    @Override
    public String toString() {

        return "" + asunto;
    }

}

class Anotacion {

    String cabecera;
    String cuerpo;
    Date fecha;

    public Anotacion(String cabecera, String cuerpo) {

        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
        fecha = new Date();
    }

    @Override
    public String toString() {

        return "Fecha: " + fecha + "\tCabecera: " + cabecera + "\nCuerpo: " + cuerpo;

    }

}

class Main {

    public static void main(String[] args) throws ParseException {
        Proyecto a = new Proyecto("A", "El primer proyecto");
        Proyecto b = new Proyecto("B", "El segundo proyecto");

    }
}
