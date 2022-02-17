/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author yared y Nathan
 */
class Proyecto {

    private TreeMap<String, Anotacion> anotaciones;
    private TreeSet<Anotacion> anotacionesPorFecha;
    private String nombre;
    private String descripcion;
    private Date fecha;

    public Proyecto(String nombre, String descripcion) {

        anotaciones = new TreeMap<String, Anotacion>();
        anotacionesPorFecha = new TreeSet<Anotacion>(new OrdenarFechasAnotaciones());
        this.nombre = nombre;
        this.descripcion = descripcion;
        fecha = new Date();
    }

    public Proyecto() {
    }

    ;
    
    public void addAnotaciones(Anotacion anotacion) {

        this.anotaciones.put(anotacion.getNombre(), anotacion);

    }

    public void removeAnotaciones(Anotacion anotacion) {

        anotaciones.remove(anotacion.getNombre());

    }

    public TreeMap<String, Anotacion> getAnotaciones() {
        return anotaciones;
    }

    public TreeSet<Anotacion> getAnotacionesPorFecha() {
        anotacionesPorFecha.addAll(anotaciones.values());
        return anotacionesPorFecha;
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

    @Override
    public String toString() {

        anotacionesPorFecha.addAll(anotaciones.values());
        String respuesta = "Proyecto: " + nombre + "\tFecha: " + fecha
                + "\nDescripcion: " + descripcion
                + "\n\n-----Anotaciones----- \n";
        for (Anotacion anotacion : anotacionesPorFecha) {
            respuesta += anotacion;
        }

        return respuesta;

    }

}

class OrdenarFechasProyectos implements Comparator<Proyecto> {

    @Override
    public int compare(Proyecto p1, Proyecto p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }

}
