/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.trabajo.estructura.controlador;

import edu.ups.ec.trabajo.estructura.modelo.Agenda;
import edu.ups.ec.trabajo.estructura.modelo.Contacto;
import edu.ups.ec.trabajo.estructura.vista.AgendaVista;



/**
 *
 * @author Usuario
 */
public class AgendaControlador<T> {
    private Agenda<T> agendaModel;
    private AgendaVista agendaView;

    public AgendaControlador(Agenda<T> agendaModel, AgendaVista agendaView) {
        this.agendaModel = agendaModel;
        this.agendaView = agendaView;
    }

    public void iniciar() {
        while (true) {
            int opcion = agendaView.mostrarMenu();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    eliminarContacto();
                    break;
                case 4:
                    return; 
                default:
                    agendaView.mostrarMensaje("Opción inválida. Ingrese un número válido.");
            }

            System.out.println();
        }
    }

    private void agregarContacto() {
        T nombre = agendaView.ingresarDato("Ingrese el nombre del contacto:");
        T telefono = agendaView.ingresarDato("Ingrese el teléfono del contacto:");
        agendaModel.agregarContacto(nombre, telefono);
        agendaView.mostrarMensaje("Contacto agregado =).");
    }

    private void buscarContacto() {
        T nombre = agendaView.ingresarDato("Ingrese el nombre del contacto a buscar:");
        Contacto<T> contacto = agendaModel.buscarContacto(nombre);

        if (contacto != null) {
            agendaView.mostrarMensaje("Contacto encontrado:");
            agendaView.mostrarMensaje("Nombre: " + contacto.getNombre());
            agendaView.mostrarMensaje("Teléfono: " + contacto.getTelefono());
        } else {
            agendaView.mostrarMensaje("Contacto no encontrado.");
        }
    }

    private void eliminarContacto() {
        T nombre = agendaView.ingresarDato("Ingrese el nombre del contacto a eliminar:");
        agendaModel.eliminarContacto(nombre);
        agendaView.mostrarMensaje("Contacto Eliminado.");
    }
}
