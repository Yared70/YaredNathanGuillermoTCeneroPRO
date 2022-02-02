/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugar;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author yared
 */
public class Partida {
    
    private HashMap<Jugador, Jugador> jugadores;
    private Integer puntosTotales;
    private Integer fallos;
    private Integer dificultad;
    private ArrayList<String> historialLetras;
    private String palabraAdivinar;
    
    String palDif1[] = {"angel", "ojo", "pizza", "enojado", "fuegos artificiales",
    "calabaza", "flor", "arco iris", "barba"};
    String palDif2[] = {"cerebro", "hebilla", "langosta", "iman", "megafono",
    "bola de nieve", "aspersor", "computadora", "estatua de la libertad"    
    };
    String palDif3[] = {"adaptacion", "evaluacion", "diagnostico", "circulacion",
    "procedimiento", "trasladar", "ocupacional", "geolocalizacion", "aprobar programacion"
    };

    
    
    public Partida(Jugador p1, Jugador p2){
    
        jugadores = new HashMap<Jugador, Jugador>();
        jugadores.put(p1, p2);
        puntosTotales = 0;
        fallos = 0;
        historialLetras = new ArrayList<>();
    }
    
    public Partida(Jugador p1, Integer dificultad){
        
        Random rnd = new Random();
        jugadores = new HashMap<Jugador, Jugador>();
        jugadores.put(p1, null);
        this.dificultad = dificultad;
        puntosTotales = 0;
        fallos = 0;
        historialLetras = new ArrayList<>();
        if(dificultad == 1){
            int aleatorio = rnd.nextInt(palDif1.length);
            palabraAdivinar = palDif1[aleatorio];
        }else if(dificultad == 2){
            int aleatorio = rnd.nextInt(palDif2.length);
            palabraAdivinar = palDif2[aleatorio];
        }else{
            int aleatorio = rnd.nextInt(palDif3.length);
            palabraAdivinar = palDif3[aleatorio];
        }
        
    }
    
    public Integer calcularPuntos(Integer fallos){
        
        Integer resultado = 0;
        
        if (fallos == 6){
            return resultado;
        }else if(dificultad == 1){
            resultado = 120 - (20*fallos);
            return resultado;
        }else if(dificultad == 2){
            resultado = 120 - (15*fallos);
            return resultado;
        }else{
            resultado = 120 - (10*fallos);
            return resultado;
        }
        
        
    }
    
    public void elegirPalabra(String palabra){
        
        palabraAdivinar = palabra;
        
        
    }

    public ArrayList<String> getHistorialLetras() {
        return historialLetras;
    }
    
    public void addLetraFallada(String letra){
        
        historialLetras.add(letra);
        
    }

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    
    
}
