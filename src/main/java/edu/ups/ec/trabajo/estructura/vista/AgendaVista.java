/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.trabajo.estructura.vista;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class AgendaVista {
    private Scanner scanner;

    public AgendaVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("==== Menú ====");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Salir");
        System.out.print("Ingrese el número de la opción deseada: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        return opcion;
    }

    public <T> T ingresarDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return (T) scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
