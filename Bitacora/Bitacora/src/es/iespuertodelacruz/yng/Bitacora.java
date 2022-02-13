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

    TreeSet<Proyecto> projects;
    String nombre;

    public Bitacora(String nombre) {

        this.nombre = nombre;
        projects = new TreeSet<Proyecto>(new OrdenarFechasProyectos());

    }
    public Bitacora(){}

    public TreeSet<Proyecto> getProjects() {
        return projects;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public void add(Proyecto proyecto) {

        this.projects.add(proyecto);

    }

    public void mostrar() {

        for (Proyecto project : projects) {
            System.out.println(project);
            System.out.println("\n");
        }

    }

}
