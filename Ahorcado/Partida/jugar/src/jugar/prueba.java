/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugar;

/**
 *
 * @author yared
 */
public class prueba {
    

  public static void main(String args[]) {
      
    String palabra = "TNETENNBA";
    String frase = "Thats A Nice Tnetennba";
    String letraselegidas = "AFXT";

    String palabraconguiones = palabra.replaceAll("[^ "+letraselegidas+"]", "-");
    String fraseconguiones = frase.replaceAll("[^ "+letraselegidas.toLowerCase()+letraselegidas+"]", "-");

    System.out.println("elige otra letra: "+ palabraconguiones);
    System.out.println("frase de ejemplo: "+ fraseconguiones);
  }
}
