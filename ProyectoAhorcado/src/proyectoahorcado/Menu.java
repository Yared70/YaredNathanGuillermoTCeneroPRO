/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoahorcado;

import java.util.Scanner;
import proyectoahorcado.Jugador;
import proyectoahorcado.Partida;
/**
 *
 * @author alumno
 */

class ahorcado{
    
}


class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Seleciona tu modo de juego");
        System.out.println("1. Un jugador");
        System.out.println("2. Multijugador");
        System.out.println("3. Mostrar historial");
        System.out.println("4. Exit");
        int modo=sc.nextInt();sc.nextLine();
        
        do{
        switch (modo){
            case 1:
            System.out.println("Cual es tu nombre");
            String nombre=sc.nextLine();
            Jugador jugador1=new Jugador(nombre);
            System.out.println("Selecciona tu dificultad");
            Integer dificultad=sc.nextInt();
            Partida p1=new Partida(jugador1,dificultad);
            //Esto no si hará falta para guardar la fecha de la partida o se hace sola
            System.out.println("Introduce la fecha con la siguiente nomenglatura aaaa/mm/dd");
            int anyo=sc.nextInt();sc.nextLine();
            int mes=sc.nextInt();sc.nextLine();
            int dia=sc.nextInt();sc.nextLine();
            /*
            //Esto es para realizar las adivinanzas de las letras que conforman la palabra
            do{
            System.out.println("Intenta adivinar una letra de la palabra");
            String letra=sc.nextLine();
            }while();
            */
            
            case 2: 
            System.out.println("Introduce el nombre del jugador 1");
            String nombre1=sc.nextLine();
            Jugador j1=new Jugador(nombre1);
            System.out.println("Introduce el nombre del jugador 2");
            String nombre2=sc.nextLine();
            Jugador j2=new Jugador(nombre2);
            Partida p2=new Partida(j1,j2);
            System.out.println("Elíge la palabra para jugar");
            String palabra=sc.nextLine();
            p2.elegirPalabra(palabra);
            
            /*
            //Esto es para realizar las adivinanzas de las letras que conforman la palabra
            do{
            System.out.println("Intenta adivinar una letra de la palabra");
            String letra=sc.nextLine();
            }while();
            */
            
            
               
            case 3: 
            System.out.println("Aquí tienes el historial de las partidas");
            break;
            
            case 4:
            System.out.println("Saliendo de la aplicación. Qué tengas un buen día");
            break;
            
        }   
        }while(modo !=4);

    }
    
}
