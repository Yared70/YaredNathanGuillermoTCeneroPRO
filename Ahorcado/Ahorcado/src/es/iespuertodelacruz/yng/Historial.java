/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author yared
 */
public class Historial{

    HashSet<Partida> historial;

    public Historial() {
        this.historial = new HashSet<>();
    }

    public void addPartida(Partida p){
        
        historial.add(p);
        
    }
    public void mostrarHistorial(){
        
        for (Partida partida : historial) {
            System.out.println(partida);
        }
        
    }

}

class ComparadorPuntos implements Comparator<Partida>{

    @Override
    public int compare(Partida p1, Partida p2) {
        return Integer.compare(p2.getPuntosTotales(), p1.getPuntosTotales());
    }
    
    
    
}

class Ranking{
    
    TreeSet<Partida> ranking;
    
    public Ranking(Comparator c){
        
        ranking = new TreeSet<Partida>(c);
        
    }
    
    public void mostrarRanking(){
        for (Partida partida : ranking) {
            System.out.println(partida);
        }
    }
    
    public void addPartida(Partida p){
        
        ranking.add(p);
        
    }

}

