package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.TrabajadorDAO;
import com.hotelnaylamp.model.entities.Trabajador;
import com.hotelnaylamp.util.Sesion;

public class TrabajadorController {
    private TrabajadorDAO trabajadorDao = new TrabajadorDAO();
    
    public String validarLogin(String usuarioIngresado, String contraseñaIngresada) {
        Trabajador trabajador = trabajadorDao.buscarTrabajadorPorCredenciales(usuarioIngresado, contraseñaIngresada);
        if(trabajador == null){
            return "Usuario o contraseña son invalido.";
        }
        Sesion.getInstancia().setTrabajadorActivo(trabajador);
        return null;
    }
}
