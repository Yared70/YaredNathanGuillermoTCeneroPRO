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
public class Historial implements Comparator<Partida> {

    HashSet<Partida> historial;
    TreeSet<Partida> ranking;

    public Historial(HashSet<Partida> historial) {
        this.historial = historial;
    }

    public Historial(TreeSet<Partida> ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compare(Partida o1, Partida o2) {
        return Integer.compare(o1.getPuntosTotales(), o2.getPuntosTotales());
    }

    
}

