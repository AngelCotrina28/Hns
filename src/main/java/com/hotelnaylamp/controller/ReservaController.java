package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ReservaDAO;

public class ReservaController {
    
    private ReservaDAO reservaDAO = new ReservaDAO();
    
    public int cargarIdReserva() {
        return reservaDAO.obtenerIdReserva();
    }
    
    public String validarMediosPago(String monto1, String monto2, 
                                    String medio2, String precioFinal) {
        try {
            float m1 = Float.parseFloat(monto1);
            if(m1 <= 0) return "El monto del Medio 1 debe ser mayor a 0";

            float total = m1;

            // Si hay segundo medio, validar también
            if(!medio2.equals("NINGUNO")) {
                float m2 = Float.parseFloat(monto2);
                if(m2 <= 0) return "El monto del Medio 2 debe ser mayor a 0";
                total += m2;
            }

            // La suma de los medios debe ser igual al precio final
            float precio = Float.parseFloat(precioFinal);
            if(Math.abs(total - precio) > 0.01f) {
                return "La suma de los medios de pago (S/. " + total + 
                       ") no coincide con el precio final (S/. " + precio + ")";
            }

            return null;
        } catch(NumberFormatException e) {
            return "Los montos de pago deben ser números válidos";
        }
    }
}
