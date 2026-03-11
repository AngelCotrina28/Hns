package com.hotelnaylamp.model.entities;


public class Reserva {
    private int idReserva;
    private float precioFinal;
    
    // Relación: La reserva TIENE UN trabajador que la atendió
    private Trabajador trabajador; 

    public Reserva() {
    }

    public Reserva(int idReserva, float precioFinal, Trabajador trabajador) {
        this.idReserva = idReserva;
        this.precioFinal = precioFinal;
        this.trabajador = trabajador;
    }
    

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    
}