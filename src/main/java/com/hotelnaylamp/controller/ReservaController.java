package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ReservaDAO;

public class ReservaController {
    
    private ReservaDAO reservaDAO = new ReservaDAO();
    
    public int cargarIdReserva() {
        return reservaDAO.obtenerIdReserva();
    }
}
