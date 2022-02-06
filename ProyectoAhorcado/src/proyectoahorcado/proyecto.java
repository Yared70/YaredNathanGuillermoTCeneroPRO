/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoahorcado;

import java.util.*;

/**
 *
 * @author Guillermo Avila Martín
 */
class Proyecto {
    
    TreeMap<String, Anotacion> asunto;
    String nombre;
    String descripcion;
    
    public Proyecto(String nombre, String descripcion){
        asunto = new TreeMap<String, Anotacion>();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void addAnotaciones(String nombre, Anotacion anotacion){
        this.asunto.put(nombre, anotacion); 
    }
    
    @Override
    public String toString(){
        return "" + asunto;
    }
    
}
