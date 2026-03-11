package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.HabitacionDAO;

public class HabitacionController {
    private HabitacionDAO habitacionDAO = new HabitacionDAO();
    
    public String obtenerPrecioHabitacion(String numeroHabitacion) {
        return habitacionDAO.obtenerPrecioHabitacion(numeroHabitacion);
    }
    
}
