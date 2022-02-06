/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoahorcado;

/**
 *
 * @author Guillermo Avila Martín
 */
public class Vista {
 
    public static void main(String[] args) {
       

        String ahorcado[][] = new String[15][20];
        for (int i = 0; i < ahorcado.length; i++) {
            for (int j = 0; j < ahorcado[0].length; j++) {
                ahorcado[i][j] = " ";
            }
        }
        
        
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
        
        //tronco
        
        ahorcado[6][11] = "|";
        ahorcado[7][11] = "|";
        ahorcado[8][11] = "|";
        ahorcado[9][11] = "|";
        
        //brazo izquierdo
        ahorcado[6][10] = "/";
        ahorcado[7][9] = "/";
        
        //brazo derecho
        ahorcado[6][12] = "\\";
        ahorcado[7][13] = "\\";
        
        //pierna izquierda
        ahorcado[10][10] = "/";
        ahorcado[11][9] = "/";
        
        //pierda derecha
        ahorcado[10][12] = "\\";
        ahorcado[11][13] = "\\";
        

        for (int i = 0; i < ahorcado.length; i++) {
            for (int j = 0; j < ahorcado[0].length; j++) {
                System.out.print(ahorcado[i][j]);
            
            }
            System.out.println("");
        }
        
        System.out.println("\n\t\t_ _ _ _\n");
        System.out.print("Errores: ");
        System.out.print("\tLetras dichas:");
        System.out.println("");
        
        
        
    }
    
    
}
