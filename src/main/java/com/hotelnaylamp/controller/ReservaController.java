package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ReservaDAO;
import com.hotelnaylamp.model.entities.Reserva;

public class ReservaController {
    
    private ReservaDAO reservaDAO = new ReservaDAO();
    
    public int obtenerIdReserva(){
        return reservaDAO.obtenerIdReserva();
    }
    
    public String validarIdReserva(){
        try {
            String error = Integer.toString(obtenerIdReserva());
        } catch (NumberFormatException e) {
            return "Error al cargar N° Reserva";
        }
        return null;
    }
    
    public Reserva cargarReserva(float precioFinalReserva, String trabajador) {
        Reserva reservaActual = new Reserva();
        reservaActual.setIdReserva(obtenerIdReserva());
        reservaActual.setPrecioFinal(precioFinalReserva);
        reservaActual.setTrabajador(trabajador);
        return reservaActual;
    }
}
