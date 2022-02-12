/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuertodelacruz.yng;

/**
 *
 * @author yared
 */
public class Vista {

    String ahorcado[][];

    public Vista() {

        ahorcado = new String[15][20];
        for (int i = 0; i < ahorcado.length; i++) {
            for (int j = 0; j < ahorcado[0].length; j++) {
                ahorcado[i][j] = " ";
            }
        }
    }

    public String Ganar() {

        String respuesta = (" _   _               _____                           _         _ \n"
                + "| | | |             |  __ \\                         | |       | |\n"
                + "| |_| |  __ _  ___  | |  \\/  __ _  _ __    __ _   __| |  ___  | |\n"
                + "|  _  | / _` |/ __| | | __  / _` || '_ \\  / _` | / _` | / _ \\ | |\n"
                + "| | | || (_| |\\__ \\ | |_\\ \\| (_| || | | || (_| || (_| || (_) ||_|\n"
                + "\\_| |_/ \\__,_||___/  \\____/ \\__,_||_| |_| \\__,_| \\__,_| \\___/ (_)");
        return respuesta;
    }

    public String Perder() {

        String respuesta = (" _   _                                _ _     _            \n"
                + "| | | |                              | (_)   | |           \n"
                + "| |_| | __ _ ___   _ __   ___ _ __ __| |_  __| | ___       \n"
                + "|  _  |/ _` / __| | '_ \\ / _ | '__/ _` | |/ _` |/ _ \\      \n"
                + "| | | | (_| \\__ \\ | |_) |  __| | | (_| | | (_| | (_) _ _ _ \n"
                + "\\_| |_/\\__,_|___/ | .__/ \\___|_|  \\__,_|_|\\__,_|\\___(_(_(_)\n"
                + "                  | |                                      \n"
                + "                  |_|                                      ");

        return respuesta;

    }

    public String Bienvenido() {

        String respuesta = (" _/          _/       _/_/_/_/       _/          _/_/_/        _/_/        _/      _/       _/_/_/_/   \n"
                + " _/          _/       _/             _/        _/            _/    _/      _/_/  _/_/       _/          \n"
                + "_/    _/    _/       _/_/_/         _/        _/            _/    _/      _/  _/  _/       _/_/_/       \n"
                + " _/  _/  _/         _/             _/        _/            _/    _/      _/      _/       _/            \n"
                + "  _/  _/           _/_/_/_/       _/_/_/_/    _/_/_/        _/_/        _/      _/       _/_/_/_/       \n"
                + "                                                                                                        \n"
                + "                                                                                                        ");

        return respuesta;

    }

    public void fallos0() {

        //base
        ahorcado[14][0] = "|";
        ahorcado[14][1] = "_";
        ahorcado[14][2] = "_";
        ahorcado[14][3] = "_";
        ahorcado[14][4] = "_";
        ahorcado[14][5] = "_";
        ahorcado[14][6] = "_";
        ahorcado[14][7] = "|";
        ahorcado[13][0] = "_";
        ahorcado[13][1] = "_";
        ahorcado[13][2] = "_";
        ahorcado[13][3] = "|";
        ahorcado[13][4] = "|";
        ahorcado[13][5] = "_";
        ahorcado[13][6] = "_";
        ahorcado[13][7] = "_";

        //palo
        ahorcado[12][3] = "|";
        ahorcado[12][4] = "|";
        ahorcado[11][3] = "|";
        ahorcado[11][4] = "|";
        ahorcado[10][3] = "|";
        ahorcado[10][4] = "|";
        ahorcado[9][3] = "|";
        ahorcado[9][4] = "|";
        ahorcado[8][3] = "|";
        ahorcado[8][4] = "|";
        ahorcado[7][3] = "|";
        ahorcado[7][4] = "|";
        ahorcado[6][3] = "|";
        ahorcado[6][4] = "|";
        ahorcado[5][3] = "|";
        ahorcado[5][4] = "|";
        ahorcado[4][3] = "|";
        ahorcado[4][4] = "|";
        ahorcado[3][3] = "|";
        ahorcado[3][4] = "|";
        ahorcado[2][3] = "|";
        ahorcado[2][4] = "|";
        ahorcado[1][3] = "|";
        ahorcado[1][4] = " ";
        ahorcado[0][3] = "_";
        ahorcado[0][4] = "_";
        ahorcado[0][5] = "_";

        ahorcado[0][6] = "_";
        ahorcado[0][7] = "_";
        ahorcado[0][8] = "_";
        ahorcado[0][9] = "_";
        ahorcado[0][10] = "_";
        ahorcado[0][11] = "_";

        ahorcado[1][5] = "_";
        ahorcado[1][6] = "_";
        ahorcado[1][7] = "_";
        ahorcado[1][8] = "_";
        ahorcado[1][9] = "_";
        ahorcado[1][10] = "_";
        ahorcado[1][11] = "_";
        ahorcado[1][12] = "|";
        ahorcado[2][11] = "|";

    }

    public void fallos1() {

        //cabeza
        ahorcado[2][10] = "_";
        ahorcado[2][12] = "_";
        ahorcado[3][9] = "/";
        ahorcado[3][13] = "\\";
        ahorcado[4][9] = "|";
        ahorcado[4][13] = "|";
        ahorcado[5][9] = "\\";
        ahorcado[5][13] = "/";
        ahorcado[5][10] = "_";
        ahorcado[5][12] = "_";

    }

    public void fallos2() {

        //tronco
        ahorcado[6][11] = "|";
        ahorcado[7][11] = "|";
        ahorcado[8][11] = "|";
        ahorcado[9][11] = "|";

    }

    public void fallos3() {

        //brazo izquierdo
        ahorcado[6][10] = "/";
        ahorcado[7][9] = "/";

    }

    public void fallos4() {

        //brazo derecho
        ahorcado[6][12] = "\\";
        ahorcado[7][13] = "\\";

    }

    public void fallos5() {

        //pierna izquierda
        ahorcado[10][10] = "/";
        ahorcado[11][9] = "/";

    }

    public void fallos6() {

        //pierda derecha
        ahorcado[10][12] = "\\";
        ahorcado[11][13] = "\\";

    }

    public void mostrar() {

        System.out.println("\n\n\n");
        for (int i = 0; i < ahorcado.length; i++) {
            for (int j = 0; j < ahorcado[0].length; j++) {
                System.out.print(ahorcado[i][j]);

            }
            System.out.println("");
        }
        System.out.println("\n");

    }
    
    public void reiniciar(){
        
        for (int i = 0; i < ahorcado.length; i++) {
            for (int j = 0; j < ahorcado[0].length; j++) {
                ahorcado[i][j] = " ";
            }
        }
        
    }

}
