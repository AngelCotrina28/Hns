package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HabitacionDAO {
    /*public void registrarHabitacion(String numeroHabitacion, int idCategoria) {
        Connection conexion = null;
        String sqlQuery = "insert into habitaciones(numero_habitacion,id_categoria) values(?,?)";
        PreparedStatement ps = null;
        try {
            conexion = ConexionBD.getInstancia().getConexion();
            ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1,numeroHabitacion);
            ps.setInt(2, idCategoria);
            ps.executeUpdate();
            System.out.println("Habitacion registrada correctamente.");
        } catch (Exception e) {
            System.out.println("Error al registrar habitacion: "+e);
        } finally {
            if ( conexion != null ) {
                conexion.close();
            }
            if ( ps != null ) {
                ps.close();
            } 
        }
    }*/
    
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
}
