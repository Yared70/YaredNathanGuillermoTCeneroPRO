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
