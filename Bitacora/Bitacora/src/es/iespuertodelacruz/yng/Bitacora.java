/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.yng;

import java.util.*;

/**
 *
 * @author yared
 */
class Bitacora {

    TreeSet<Proyecto> proyectosPorFecha;
    TreeMap<String, Proyecto> Proyectos;
    String nombre;

    public Bitacora(String nombre) {

        this.nombre = nombre;
        proyectosPorFecha = new TreeSet<Proyecto>(new OrdenarFechasProyectos());
        Proyectos = new TreeMap<String, Proyecto>();

    }

    public Bitacora() {
    }

    public TreeMap<String, Proyecto> getProyectos() {
        return Proyectos;
    }

    public TreeSet<Proyecto> getProjectsOrFecha() {

        proyectosPorFecha.addAll(Proyectos.values());
        return proyectosPorFecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Proyecto getProyecto(String nombre) {

        Proyecto p = new Proyecto();
        p = Proyectos.get(nombre);
        return p;

    }

    public void remove(Proyecto proyecto) {

        Proyectos.remove(proyecto.getNombre());

    }

    public void add(Proyecto proyecto) {

        this.Proyectos.put(proyecto.getNombre(), proyecto);

    }

    public void mostrar() {

        proyectosPorFecha.addAll(Proyectos.values());
        for (Proyecto project : proyectosPorFecha) {
            System.out.println(project);
            System.out.println("\n");
        }

    }

}
