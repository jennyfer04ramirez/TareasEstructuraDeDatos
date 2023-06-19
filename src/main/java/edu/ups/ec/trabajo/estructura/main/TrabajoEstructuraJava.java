/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ups.ec.trabajo.estructura.main;

import edu.ups.ec.trabajo.estructura.controlador.AgendaControlador;
import edu.ups.ec.trabajo.estructura.modelo.Agenda;
import edu.ups.ec.trabajo.estructura.vista.AgendaVista;


/**
 *
 * @author Usuario
 */
    

public class  TrabajoEstructuraJava {
    public static void main(String[] args) {
        Agenda<String> agendaModel = new Agenda<>();
        AgendaVista agendaView = new AgendaVista();
        AgendaControlador<String> agendaController = new AgendaControlador<>(agendaModel, agendaView);
        agendaController.iniciar();
    }
}
