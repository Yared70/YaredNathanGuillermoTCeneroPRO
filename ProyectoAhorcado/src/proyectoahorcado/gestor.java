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
class Gestor{
    
    TreeMap<String, Proyecto> projects;
    String nombre;
    
    public Gestor(String nombre){
        
        this.nombre = nombre;
        projects = new TreeMap<String, Proyecto>();
        
    }
    
    public void add(String nombre, Proyecto proyecto){
        
        this.projects.put(nombre, proyecto);
        
    }
    
    public String mostrar(){
        
        String respuesta = "";
        
        Iterator it = projects.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry<String, Proyecto> entry = (Map.Entry<String, Proyecto>) it.next();
            respuesta += "\nNombre: " + entry.getKey() + ", Proyecto: " + entry.getValue();
        }
        
        return respuesta;
        
    }
    
   
}
