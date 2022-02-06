/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoahorcado;

import java.util.Scanner;

/**
 *
 * @author yared
 */
public class prueba {
    
    public static void main(String[] args) {
        
       String palabra = "TNETENNBA";
    String frase = "Thats  A  Nice  Tnetennba";
    String letraselegidas = "AFXT";

    String palabraconguiones = palabra.replaceAll("[^ "+letraselegidas+"]", "_ ");
    String fraseconguiones = frase.replaceAll("[^ "+letraselegidas.toLowerCase()+letraselegidas+"]", "_ ");

    System.out.println("elige otra letra: "+ palabraconguiones);
    System.out.println("frase de ejemplo: "+ fraseconguiones);
        
    
    Partida partida1 = new Partida(new Jugador("Yared"), 1);
        System.out.println(partida1.getFecha());
        
      
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce");
            sc.nextLine();
        
    Partida partida2 = new Partida(new Jugador("Yared"), 1);
    System.out.println(partida2.getFecha());
            
            System.out.println("Introduce");
            sc.nextLine();
            
    System.out.println(partida1.getFecha());
    System.out.println(partida2.getFecha());
    }
    
}
