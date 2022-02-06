/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoahorcado;

/**
 *
 * @author Guillermo Avila Martín
 */
public class Jugar {

    public static void main(String[] args) {
     
        Jugador j1 = new Jugador("yared");
        Partida p1 = new Partida(j1, 3);
        
        System.out.println(p1.getPalabraAdivinar());
        System.out.println(p1.getFecha());
        
        Partida p2 = new Partida(j1,2);
        System.out.println(p2.getFecha());
    }
    
}
