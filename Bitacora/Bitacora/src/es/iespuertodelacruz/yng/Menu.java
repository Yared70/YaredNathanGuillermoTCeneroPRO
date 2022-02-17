/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.iespuertodelacruz.yng;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author yared
 */
public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido:\n");
        int opcion = 0;
        TreeMap<String, Proyecto> bitacoraMap;
        TreeMap<String, Anotacion> proyectoMap;
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

            System.out.println("\n------ Menú ------\n");
            System.out.println("1) Crear Bitácora");
            System.out.println("2) Crear Proyecto");
            System.out.println("3) Crear Anotación");
            System.out.println("4) Eliminar proyecto");
            System.out.println("5) Eliminar anotacion");
            System.out.println("6) Mostrar Bitácora");
            System.out.println("7) Mostrar Proyecto");
            System.out.println("8) Mostrar Anotación");
            System.out.println("9) Salir\n");
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

                    if (b == null) {
                        System.out.println("\nERROR: Necesitas crear una bitácora primero\n");
                    } else {
                        bitacoraMap = b.getProyectos();
                        if (bitacoraMap.containsKey(nombre)) {
                            System.out.println("\nERROR: Ya existe el proyecto");
                        } else {
                            b.add(p);
                        }
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

                    bitacoraMap = b.getProyectos();
                    if (bitacoraMap.containsKey(proyecto)) {
                        p = bitacoraMap.get(proyecto);
                        proyectoMap = p.getAnotaciones();
                        if (proyectoMap.containsKey(nombre)) {
                            System.out.println("\nERROR: Ya existe esa anotación");
                        } else {
                            p.addAnotaciones(a);
                        }
                    } else {
                        System.out.println("\nERROR: No existe el proyecto");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el nombre del proyecto a eliminar:");
                    proyecto = sc.nextLine();
                    bitacoraMap = b.getProyectos();

                    if (bitacoraMap.containsKey(proyecto)) {
                        b.remove(bitacoraMap.get(proyecto));
                    } else {
                        System.out.println("\nERROR: No existe el proyecto");
                    }
                    break;

                case 5:
                    System.out.println("Introduce el nombre de la anotacion a eliminar");
                    anotacion = sc.nextLine();
                    System.out.println("Introduce el proyecto del cuál quieres eliminar la anotacion");
                    proyecto = sc.nextLine();
                    proyectoMap = p.getAnotaciones();
                    bitacoraMap = b.getProyectos();
                    if (bitacoraMap.containsKey(proyecto)) {
                        p = bitacoraMap.get(proyecto);
                        if (proyectoMap.containsKey(anotacion)) {
                            a = proyectoMap.get(anotacion);
                            p.removeAnotaciones(a);
                        } else {
                            System.out.println("No existe esa anotación en ese proyecto");
                        }
                    } else {
                        System.out.println("\nERROR: No existe ese proyecto");
                    }
                    break;

                case 6:
                    b.mostrar();
                    break;
                case 7:
                    System.out.println("Introduce el proyecto que quieres ver:");
                    proyecto = sc.nextLine();
                    bitacoraMap = b.getProyectos();
                    if (bitacoraMap.containsKey(proyecto)) {
                        p = bitacoraMap.get(proyecto);
                        System.out.println(p.toString());
                    } else {
                        System.out.println("\nERROR: No existe ese proyecto");
                    }
                    break;
                case 8:
                    System.out.println("Introduce el nombre de la anotacion que quieres ver");
                    anotacion = sc.nextLine();
                    System.out.println("Introduce el proyecto del cuál quieres ver la anotacion");
                    proyecto = sc.nextLine();

                    proyectoMap = p.getAnotaciones();
                    bitacoraMap = b.getProyectos();
                    if (bitacoraMap.containsKey(proyecto)) {
                        if (proyectoMap.containsKey(anotacion)) {
                            a = proyectoMap.get(anotacion);
                            System.out.println(a.toString());
                        } else {
                            System.out.println("No existe esa anotación en ese proyecto");
                        }
                    } else {
                        System.out.println("\nERROR: No existe ese proyecto");
                    }

                    break;
                case 9:
                    System.out.println("\nAdios");
                    break;

            }

        }

    }

}
