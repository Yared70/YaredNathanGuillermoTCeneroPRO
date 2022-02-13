/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author yared y Nathan
 */
class Proyecto{
    
    private TreeSet<Anotacion> anotaciones;
    private String nombre;
    private String descripcion;
    private Date fecha;
    
    public Proyecto(String nombre, String descripcion){
        
        anotaciones = new TreeSet<Anotacion>(new OrdenarFechasAnotaciones());
        this.nombre = nombre;
        this.descripcion = descripcion;
        fecha = new Date();
    }
    
    public Proyecto(){};
    
    public void addAnotaciones(Anotacion anotacion){
        
        this.anotaciones.add(anotacion);
        
    }
    
    
    
    @Override
    public String toString(){
        
        String respuesta = "Proyecto: " + nombre + "\tFecha: " + fecha +
                "\nDescripcion: " + descripcion +
                "\nAnotaciones: \n";
        for (Anotacion anotacion : anotaciones) {
            respuesta += anotacion;
        }
        
        return respuesta;
                
    }

    public TreeSet<Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }


} 

class OrdenarFechasProyectos implements Comparator<Proyecto> {

    @Override
    public int compare(Proyecto p1, Proyecto p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }


    
}
     




   

   