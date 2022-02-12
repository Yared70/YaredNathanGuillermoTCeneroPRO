/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.yng;

import java.util.Scanner;

/**
 *
 * @author guillermo y yared
 */
class ahorcado {

}

class Menu {

    public static void main(String[] args) {

        Historial h = new Historial();
        ComparadorPuntos c = new ComparadorPuntos();
        Ranking r = new Ranking(c);
        Vista v = new Vista();
        Partida p = new Partida();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        boolean ganar = false;
        int modo = 0;
        System.out.println(v.Bienvenido());
        while (modo != 5) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Selecciona tu modo de juego");
            System.out.println("1. Un jugador");
            System.out.println("2. Multijugador");
            System.out.println("3. Mostrar historial");
            System.out.println("4. Mostrar ranking");
            System.out.println("5. Exit");
            System.out.println("");
            modo = sc.nextInt();
            sc.nextLine();
            switch (modo) {
                case 1:
                    v.reiniciar();
                    ganar = false;
                    p.setFallos(0);
                    System.out.println("Cuál es tu nombre?");
                    String nombre = sc.nextLine();
                    j1 = new Jugador(nombre);
                    System.out.println("Selecciona tu dificultad: 1, 2 o 3");
                    Integer dificultad = sc.nextInt();
                    sc.nextLine();
                    p = new Partida(j1, dificultad);
                    String palabra = p.getPalabraAdivinar();

                    while (p.getFallos() < 6 && !ganar) {
                        limpiar();
                        if (!p.getPalabraAdivinar().equals(p.palabraGuiones())) {

                            if (p.getFallos() == 0) {
                                v.fallos0();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }

                            } else if (p.getFallos() == 1) {
                                v.fallos1();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 2) {
                                v.fallos2();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 3) {
                                v.fallos3();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 4) {
                                v.fallos4();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 5) {
                                v.fallos5();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            }
                        } else if (p.getPalabraAdivinar().equals(p.palabraGuiones())) {
                            System.out.println(v.Ganar());
                            ganar = true;
                            p.calcularPuntos();
                            h.addPartida(p);
                            r.addPartida(p);
                            System.out.println("\n");
                            break;
                        }

                    }

                    if (p.getFallos() == 6) {
                        v.fallos6();
                        v.mostrar();
                        System.out.println(v.Perder());
                        System.out.println("\nLa palabra era: " + p.getPalabraAdivinar());
                        System.out.println("\n");
                        modo = 5;
                        break;
                    }
                    break;

                case 2:
                    v.reiniciar();
                    ganar = false;
                    p.setFallos(0);
                    System.out.println("El jugador 2 indicara la palabra y "
                            + "el jugador 1 tratara de adivinarla."
                            + "\nEste modo equivale a la dificultad 3");
                    System.out.println("Cuál es el nombre del jugador 1?");
                    String j1str = sc.nextLine();
                    System.out.println("Cuál es el nombre del jugador 2?");
                    String j2str = sc.nextLine();
                    j1 = new Jugador(j1str);
                    j2 = new Jugador(j2str);
                    p = new Partida(j1, j2);
                    System.out.println("Jugador 2 introduce la palabra a"
                            + " adivinar."
                            + "\nJugador 1, No mires!");
                    palabra = sc.nextLine();
                    p.elegirPalabra(palabra);
                    while (p.getFallos() < 6 && !ganar) {
                        limpiar();

                        if (!p.getPalabraAdivinar().equals(p.palabraGuiones())) {

                            if (p.getFallos() == 0) {
                                v.fallos0();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }

                            } else if (p.getFallos() == 1) {
                                v.fallos1();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 2) {
                                v.fallos2();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 3) {
                                v.fallos3();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 4) {
                                v.fallos4();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            } else if (p.getFallos() == 5) {
                                v.fallos5();
                                v.mostrar();
                                System.out.println(p.palabraGuiones());
                                System.out.print("\n\nLetras ya dichas:" + p.getHistorialLetras());
                                System.out.println("\tFallos: " + p.getFallos());
                                System.out.println("\nIntroduce una letra");
                                String letra = sc.nextLine();
                                p.addLetra(letra);
                                if (!palabra.contains(letra)) {
                                    p.SumarFallo();
                                }
                            }
                        } else if (p.getPalabraAdivinar().equals(p.palabraGuiones())) {
                            System.out.println(v.Ganar());
                            System.out.println("\n");
                            ganar = true;
                            p.calcularPuntos();
                            h.addPartida(p);
                            r.addPartida(p);

                            break;
                        }

                    }

                    if (p.getFallos() == 6) {
                        v.fallos6();
                        v.mostrar();
                        System.out.println(v.Perder());
                        System.out.println("\nLa palabra era: " + p.getPalabraAdivinar());
                        System.out.println("\n");
                        modo = 5;

                        break;
                    }
                    break;

                case 3:
                    System.out.println("  _   _   _         _                    _           _ \n"
                            + " | | | | (_)  ___  | |_    ___    _ __  (_)   __ _  | |\n"
                            + " | |_| | | | / __| | __|  / _ \\  | '__| | |  / _` | | |\n"
                            + " |  _  | | | \\__ \\ | |_  | (_) | | |    | | | (_| | | |\n"
                            + " |_| |_| |_| |___/  \\__|  \\___/  |_|    |_|  \\__,_| |_|\n"
                            + "                                                       ");
                    System.out.println("\n");
                    h.mostrarHistorial();
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("  ____                    _      _                 \n"
                            + " |  _ \\    __ _   _ __   | | __ (_)  _ __     __ _ \n"
                            + " | |_) |  / _` | | '_ \\  | |/ / | | | '_ \\   / _` |\n"
                            + " |  _ <  | (_| | | | | | |   <  | | | | | | | (_| |\n"
                            + " |_| \\_\\  \\__,_| |_| |_| |_|\\_\\ |_| |_| |_|  \\__, |\n"
                            + "                                             |___/ ");
                    System.out.println("\n");
                    r.mostrarRanking();
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("               ,.,   '          ;'*¨'`·- .,  ‘                  ,.-·.            , ·. ,.-·~·.,   ‘                 ,. -,    \n"
                            + "              ;´   '· .,         \\`:·-,. ,   '` ·.  '           /    ;'\\'         /  ·'´,.-·-.,   `,'‚           ,.·'´,    ,'\\   \n"
                            + "            .´  .-,    ';\\        '\\:/   ;\\:'`:·,  '`·, '       ;    ;:::\\       /  .'´\\:::::::'\\   '\\ °     ,·'´ .·´'´-·'´::::\\' \n"
                            + "           /   /:\\:';   ;:'\\'       ;   ;'::\\;::::';   ;\\      ';    ;::::;'   ,·'  ,'::::\\:;:-·-:';  ';\\‚    ;    ';:::\\::\\::;:'  \n"
                            + "         ,'  ,'::::'\\';  ;::';       ;  ,':::;  `·:;;  ,':'\\'     ;   ;::::;   ;.   ';:::;´       ,'  ,':'\\‚   \\·.    `·;:'-·'´     \n"
                            + "     ,.-·'  '·~^*'´¨,  ';::;      ;   ;:::;    ,·' ,·':::;    ';  ;'::::;     ';   ;::;       ,'´ .'´\\::';‚   \\:`·.   '`·,  '     \n"
                            + "     ':,  ,·:²*´¨¯'`;  ;::';      ;  ;:::;'  ,.'´,·´:::::;    ;  ';:::';      ';   ':;:   ,.·´,.·´::::\\;'°     `·:'`·,   \\'      \n"
                            + "     ,'  / \\::::::::';  ;::';     ':,·:;::-·´,.·´\\:::::;´'     ';  ;::::;'      \\·,   `*´,.·'´::::::;·´         ,.'-:;'  ,·\\     \n"
                            + "    ,' ,'::::\\·²*'´¨¯':,'\\:;       \\::;. -·´:::::;\\;·´         \\*´\\:::;‘       \\\\:¯::\\:::::::;:·´       ,·'´     ,.·´:::'\\    \n"
                            + "    \\`¨\\:::/          \\::\\'        \\;'\\::::::::;·´'             '\\::\\:;'         `\\:::::\\;::·'´  °         \\`*'´\\::::::::;·'‘   \n"
                            + "     '\\::\\;'            '\\;'  '         `\\;::-·´                   `*´‘              ¯                     \\::::\\:;:·´        \n"
                            + "       `¨'                                                                          ‘                       '`*'´‘            ");
                    break;
            }

        }

    
    }        

    public static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    }
    
   
