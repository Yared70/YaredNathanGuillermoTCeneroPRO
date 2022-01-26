/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitacora;

/**
 *
 * @author yared
 */
public class Bitacora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Anotacion anProject1 = new Anotacion("Proyecto pro", "Prueba 1 para el "
                + "proyecto de programacion");
        
        Proyecto project1 = new Proyecto("Creacion bitacora", "Prueba de creacion");
        project1.addAnotaciones("Anotacion", anProject1);
        
        Gestor gestorProyectos = new Gestor("Programacion");
        gestorProyectos.add("Bitacora", project1);
        
        Proyecto project2 = new Proyecto("Ordenar Strings", "Prueba de algoritmo"
                + "de ordenacion de Strings");
        Anotacion anProject2 = new Anotacion("Fallo al ordenar", "Cuando intento"
                + "ordenar me sale el error de que se sale del array. Tengo que"
                + "comprobar por qué");
        project2.addAnotaciones("Anotacion1", anProject2);
        gestorProyectos.add("Ordenar Strings", project2);
        
        
        
        System.out.println(gestorProyectos.mostrar());
        
        
        
    }
    
}
