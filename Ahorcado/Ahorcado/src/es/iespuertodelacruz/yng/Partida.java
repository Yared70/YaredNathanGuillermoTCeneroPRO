/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.ArrayList;
import java.util.Date;
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

    String palDif1[] = {"angel", "ojo", "pizza", "enojado", "artificiales",
        "calabaza", "flor", "arco", "barba"};
    String palDif2[] = {"cerebro", "hebilla", "langosta", "iman", "megafono",
        "saxofonista", "aspersor", "computadora", "libertad"
    };
    String palDif3[] = {"adaptacion", "evaluacion", "diagnostico", "circulacion",
        "procedimiento", "trasladar", "ocupacional", "geolocalizacion", "trasnochador"
    };

    public Partida(Jugador p1, Jugador p2) {

        jugadores = new HashMap<Jugador, Jugador>();
        jugadores.put(p1, p2);
        puntosTotales = 0;
        fallos = 0;
        historialLetras = new ArrayList<>();
    }

    public Partida(Jugador p1, Integer dificultad) {

        Random rnd = new Random();
        jugadores = new HashMap<Jugador, Jugador>();
        jugadores.put(p1, null);
        this.dificultad = dificultad;
        puntosTotales = 0;
        fallos = 0;
        historialLetras = new ArrayList<>();
        if (dificultad == 1) {
            int aleatorio = rnd.nextInt(palDif1.length);
            palabraAdivinar = palDif1[aleatorio];
        } else if (dificultad == 2) {
            int aleatorio = rnd.nextInt(palDif2.length);
            palabraAdivinar = palDif2[aleatorio];
        } else {
            int aleatorio = rnd.nextInt(palDif3.length);
            palabraAdivinar = palDif3[aleatorio];
        }

    }

    public void calcularPuntos() {

        Integer resultado = 0;

        if (jugadores.containsValue(null)) {
            if (fallos == 6) {
                resultado = 0;
            } else if (dificultad == 1) {
                resultado = 120 - (20 * fallos);
            } else if (dificultad == 2) {
                resultado = 120 - (15 * fallos);
            } else {
                resultado = 120 - (10 * fallos);
            }
        } else {
            if (fallos == 6) {
                resultado = 0;
            } else {
                resultado = 120 - (10 * fallos);
            }
        }

        puntosTotales = resultado;

    }

    public Integer getPuntosTotales() {
        return puntosTotales;
    }

    public Integer getFallos() {
        return fallos;
    }

    public void SumarFallo() {

        fallos++;

    }

    public void elegirPalabra(String palabra) {

        palabraAdivinar = palabra;

    }

    public ArrayList<String> getHistorialLetras() {
        return historialLetras;
    }

    public void addLetra(String letra) {

        historialLetras.add(letra);

    }

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public String palabraGuiones() {

        String palabra = this.palabraAdivinar;
        String letraselegidas = "";
        for (int i = 0; i < historialLetras.size(); i++) {
            letraselegidas += historialLetras.get(i);
        }

        String palabraconguiones = palabra.replaceAll("[^ " + letraselegidas + "]", "_ ");

        return palabraconguiones;

    }

    @Override
    public String toString() {

        String respuesta = "";

        if (jugadores.containsValue(null)) {
            for (Jugador key : jugadores.keySet()) {
                respuesta += "Jugador: " + key + "\tDificultad: "
                        + dificultad + "\tPalabra a adivinar: " + palabraAdivinar
                        + "\tFallos: " + fallos + "\tPuntos totales: " + puntosTotales;
            }
        } else {
            for (Jugador key : jugadores.keySet()) {
                for (Jugador value : jugadores.values()) {
                    respuesta += "Jugador1: " + key + "\tJugador2: " + value
                            + "\tPalabra a adivinar: " + palabraAdivinar
                            + "\tFallos: " + fallos + "\tPuntos totales: " + puntosTotales;

                }

            }
        }
        return respuesta;

    }

}
