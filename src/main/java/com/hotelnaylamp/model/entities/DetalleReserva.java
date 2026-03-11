package com.hotelnaylamp.model.entities;

import java.time.LocalDateTime; // Usamos LocalDateTime para fecha y hora

public class DetalleReserva {
    private int idDetalleReserva;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    private float precio;
    private float cantidadPagada;
    private String estadoDetalleReserva;
    // Relaciones
    private Reserva reserva;       // Pertenece a una cabecera de reserva
    private Habitacion habitacion; // Ocupa una habitación específica

    public DetalleReserva() {
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    public void setIdDetalleReserva(int idDetalleReserva) {
        this.idDetalleReserva = idDetalleReserva;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public float getPrecioFinal() {
        return precio;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precio = precioFinal;
    }

    public float getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(float cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }

    public String getEstadoDetalleReserva() {
        return estadoDetalleReserva;
    }

    public void setEstadoDetalleReserva(String estadoDetalleReserva) {
        this.estadoDetalleReserva = estadoDetalleReserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    
}