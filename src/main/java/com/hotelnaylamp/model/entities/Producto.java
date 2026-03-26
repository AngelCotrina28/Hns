package com.hotelnaylamp.model.entities;


public class Producto {
    private int idProducto;
    private String nombre;
    private float precio;
    private String activo;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, float precio, String activo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
