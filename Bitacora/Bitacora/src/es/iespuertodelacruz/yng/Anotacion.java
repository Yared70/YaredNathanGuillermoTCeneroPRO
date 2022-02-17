/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.yng;

import java.util.*;

/**
 *
 * @author yared y Nathan
 */
class Anotacion {

    private String nombre;
    private String cabecera;
    private String cuerpo;
    private Date fecha;

    public Anotacion(String nombre, String cabecera, String cuerpo) {
        this.nombre = nombre;
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
        fecha = new Date();
    }

    public Anotacion() {
    }

    ;
    
    

    @Override
    public String toString() {

        return "\nNombre: " + nombre
                + "\nCabecera: " + cabecera + "\tFecha: " + fecha
                + "\nCuerpo: " + cuerpo + "\n";

    }

    public String getCabecera() {
        return cabecera;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }
}

class OrdenarFechasAnotaciones implements Comparator<Anotacion> {

    @Override
    public int compare(Anotacion a1, Anotacion a2) {
        return a1.getFecha().compareTo(a2.getFecha());
    }

}
