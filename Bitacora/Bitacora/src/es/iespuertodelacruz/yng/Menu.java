/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author yared
 */
public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido:\n");
        int opcion = 0;
        String nombre;
        String cabecera;
        String descripcion;
        String cuerpo;
        String anotacion;
        String proyecto;
        Bitacora b = null;
        Proyecto p = null;
        Anotacion a = null;

        while (opcion != 9) {

            System.out.println("\n------ Menú ------");
            System.out.println("1) Crear Bitácora");
            System.out.println("2) Crear Proyecto");
            System.out.println("3) Crear Anotación");
            System.out.println("4) Eliminar proyecto");
            System.out.println("5) Eliminar anotacion");
            System.out.println("6) Mostrar Bitácora");
            System.out.println("7) Mostrar Proyecto");
            System.out.println("8) Mostrar Anotación");
            System.out.println("9) Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nIntroduce el nombre de la Bitácora:");
                    nombre = sc.nextLine();
                    b = new Bitacora(nombre);
                    break;
                case 2:
                    System.out.println("\nIntroduce el nombre del Proyecto");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la descripcion del Proyecto");
                    descripcion = sc.nextLine();
                    p = new Proyecto(nombre, descripcion);
                    try {
                        b.add(p);
                    } catch (Exception e) {
                        System.out.println("ERROR: Necesitas crear una bitácora primero\n");
                    }
                    
                    break;
                case 3:
                    System.out.println("\nIntroduce el nombre de la Anotación");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la cabecera de la Anotación");
                    cabecera = sc.nextLine();
                    System.out.println("Introduce el cuerpo de la Anotación");
                    cuerpo = sc.nextLine();
                    a = new Anotacion(nombre, cabecera, cuerpo);
                    System.out.println("Introduce el nombre del proyecto al que "
                            + "quieres añadir la anotacion");
                    proyecto = sc.nextLine();
                    for (Proyecto project : b.getProjects()) {
                                if (project.getNombre().equals(proyecto)) {
                                    project.addAnotaciones(a);
                                    break;
                                } else {
                                    System.out.println("No existe ese proyecto");
                                    break;
                                }
                            }
                    
                    
                    break;
                case 4:
                    System.out.println("Introduce el nombre del proyecto a eliminar:");
                    proyecto = sc.nextLine();
                    for (Proyecto project : b.getProjects()) {
                        if(project.getNombre().equals(proyecto)){
                            b.getProjects().remove(project);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Introduce el nombre de la anotacion a eliminar");
                    anotacion = sc.nextLine();
                    System.out.println("Introduce el proyecto del cuál quieres eliminar la anotacion");
                    proyecto = sc.nextLine();
                    for (Proyecto project : b.getProjects()) {
                        if(project.getNombre().equals(proyecto)){
                            for (Anotacion anotacion1 : project.getAnotaciones()) {
                                if(anotacion1.getNombre().equals(anotacion)){
                                    project.getAnotaciones().remove(anotacion1);
                                    break;
                                }else{
                                    System.out.println("No existe esa anotación");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("No existe ese proyecto");
                            break;
                        }
                    }
                    break;

                case 6:
                    b.mostrar();
                    break;
                case 7:
                    System.out.println("Introduce el proyecto que quieres ver:");
                    proyecto = sc.nextLine();
                    for (Proyecto project : b.getProjects()) {
                        if(project.getNombre().equals(proyecto)){
                            System.out.println("\n" + project.toString());
                            break;
                        }else{
                            System.out.println("No existe el proyecto");
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Introduce el nombre de la anotacion que quieres ver");
                    anotacion = sc.nextLine();
                    System.out.println("Introduce el proyecto del cuál quieres ver la anotacion");
                    proyecto = sc.nextLine();
                    for (Proyecto project : b.getProjects()) {
                        if(project.getNombre().equals(proyecto)){
                            for (Anotacion anotacion1 : project.getAnotaciones()) {
                                if(anotacion1.getNombre().equals(anotacion)){
                                    System.out.println("\n" + anotacion1.toString());
                                    break;
                                }else{
                                    System.out.println("No existe esa anotación");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("No existe ese proyecto");
                            break;
                        }
                    }
                    break;
                case 9:
                    System.out.println("Adios");
                    break;
                    

            }

        }

    }

}
