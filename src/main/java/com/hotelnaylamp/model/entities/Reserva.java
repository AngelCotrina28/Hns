package com.hotelnaylamp.model.entities;


public class Reserva {
    private int idReserva;
    private float precioFinal;
    private String trabajador;

    public Reserva() {
    }

    public Reserva(int idReserva, float precioFinal, String trabajador) {
        this.idReserva = idReserva;
        this.precioFinal = precioFinal;

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

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }
    


    
}