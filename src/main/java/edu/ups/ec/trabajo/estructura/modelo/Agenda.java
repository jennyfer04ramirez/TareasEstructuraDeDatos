/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.trabajo.estructura.modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */

public class Agenda<T> {
    private List<Contacto<T>> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> contacto = new Contacto<>(nombre, telefono);
        contactos.add(contacto);
    }

    public Contacto<T> buscarContacto(T nombre) {
        for (Contacto<T> contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void eliminarContacto(T nombre) {
        Contacto<T> contactoAEliminar = null;

        for (Contacto<T> contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                contactoAEliminar = contacto;
                break;
            }
        }

        if (contactoAEliminar != null) {
            contactos.remove(contactoAEliminar);
        }
    }
}
