package com.hotelnaylamp.util;

import com.hotelnaylamp.model.entities.Trabajador;

public class Sesion {
    private static Sesion instancia;
    private Trabajador trabajadorActivo;
    
    private Sesion() {}
    
    public static Sesion getInstancia() {
        if(instancia == null) {
            instancia = new Sesion();
        }
        return instancia;
    }
    
    public Trabajador getTrabajadorActivo() {
        return trabajadorActivo;
    }
    
    public void setTrabajadorActivo(Trabajador trabajador) {
        this.trabajadorActivo = trabajador;
    }
}