package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.HabitacionDAO;
import com.hotelnaylamp.model.entities.Habitacion;
import java.util.List;

public class HabitacionController {
    private HabitacionDAO habitacionDAO = new HabitacionDAO();
    
    public String obtenerPrecioHabitacion(String numeroHabitacion) {
        return habitacionDAO.obtenerPrecioHabitacion(numeroHabitacion);
    }
    
    public List<Habitacion> obtenerTodasLasHabitaciones() {
        return habitacionDAO.obtenerTodasLasHabitaciones();
    }
    
}
