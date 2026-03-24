package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.model.entities.Habitacion;
import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HabitacionDAO {
    
    public int obtenerIdHabitacionPorNumeroHabitacion(String numeroHabitacion) {
        String sqlQuery = "select id_habitacion from habitaciones where numero_habitacion = ?";
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1, numeroHabitacion);
            try(ResultSet rs = ps.executeQuery()) {
                if( rs.next() ) {
                    int idHabitacion = rs.getInt("id_habitacion");
                    return idHabitacion;
                } else {
                    return -1;
                }
            }
        } catch(SQLException e) {
          System.out.println("Error al obtener habitacion.\n"+e);
          return -1;
        } 
    }
    
    public String obtenerPrecioHabitacion(String numeroHabitacion) {
        String sqlQuery = "select c.precio_base from habitaciones h join categorias c on h.id_categoria = c.id_categoria where h.numero = ?";
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1, numeroHabitacion);
            ResultSet rs = ps.executeQuery();
            if( rs.next() ) {
                String precioBase = Float.toString(rs.getFloat("precio_base"));
                return precioBase;
            } else {
                return "No se encontro Precio";
            }     
        } catch (SQLException e) {
            System.out.println("Error al obtener Precio de Habitacion: "+e);
            return "Error al cargar Precio";
        }
    }
    
    public List<Habitacion> obtenerTodasLasHabitaciones() {
    String sqlQuery = "SELECT numero, estado FROM habitaciones ORDER BY FLOOR(numero/100) DESC, numero ASC";
    List<Habitacion> listaHabitaciones = new ArrayList<>();
    try {
        Connection conexion = ConexionBD.getInstancia().getConexion();
        // try-with-resources cierra ps y rs automáticamente
        try(PreparedStatement ps = conexion.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery()) {
            while(rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setNumero(rs.getString("numero"));
                habitacion.setEstado(rs.getString("estado"));
                listaHabitaciones.add(habitacion);
            }
        }
    } catch(SQLException e) {
        System.out.println("Error al obtener habitaciones: " + e);
    }
    return listaHabitaciones;
}
}
