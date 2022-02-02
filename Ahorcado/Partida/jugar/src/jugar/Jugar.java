/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugar;

/**
 *
 * @author yared
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
