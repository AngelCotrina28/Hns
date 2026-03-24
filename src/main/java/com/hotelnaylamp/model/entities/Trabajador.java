package com.hotelnaylamp.model.entities;

public class Trabajador {
    private int idTrabajador;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private String telefono;
    private String rol;
    private String activo;

    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String rol, String activo) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
        this.activo = activo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    
    
}
