package com.hotelnaylamp.model.entities;

import com.hotelnaylamp.model.entities.DetalleReserva;
import com.hotelnaylamp.model.entities.Cliente;


public class DetalleReservaCliente {
    private int idDrc;
    // Relaciones
    private DetalleReserva detalleReserva; // Vincula el cuarto reservado...
    private Cliente cliente;               // ...con la persona que lo habita

    public DetalleReservaCliente() {
    }

    public int getIdDrc() {
        return idDrc;
    }

    public void setIdDrc(int idDrc) {
        this.idDrc = idDrc;
    }

    public DetalleReserva getDetalleReserva() {
        return detalleReserva;
    }

    public void setDetalleReserva(DetalleReserva detalleReserva) {
        this.detalleReserva = detalleReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
