package com.hotelnaylamp.model.entities;

import com.hotelnaylamp.model.entities.Categoria;


public class Habitacion {
    private int idHabitacion;
    private String numero;
    private String estado;
    // Relación: Una habitación TIENE UNA categoría
    private Categoria categoria; 

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, String numero, String estado, Categoria categoria) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.estado = estado;
        this.categoria = categoria;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
}
