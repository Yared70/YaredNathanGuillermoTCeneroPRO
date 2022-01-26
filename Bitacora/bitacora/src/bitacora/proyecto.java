/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bitacora;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author yared
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




   

   