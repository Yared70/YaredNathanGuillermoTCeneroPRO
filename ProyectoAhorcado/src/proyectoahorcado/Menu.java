/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoahorcado;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

class ahorcado{
    
}


public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Seleciona tu modo de juego");
        System.out.println("1. Un jugador");
        System.out.println("2. Multijugador");
        System.out.println("3. Exit");
        int modo=sc.nextInt();sc.nextLine();
        
        do{
        switch (modo){
            case 1: System.out.println("Adivina una letra");
            String letra=sc.nextLine();
            if(palabra==true){
                break;
            }
            
            case 2: System.out.println("¿Quién va a escribir la palabra?");
            int jugador=sc.nextInt();
            System.out.println("Elige una letra, para adivinar");
            letra=sc.nextLine();
            if(palabra==true){
                break;
            }
            case 3: System.out.println("Saliendo del juego. Adiós");
            break;
        }   
        }while(modo !=3);
        
        
    }
    
}
