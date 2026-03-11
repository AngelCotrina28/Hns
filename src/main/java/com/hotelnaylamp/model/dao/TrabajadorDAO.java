package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrabajadorDAO {
  
    public void registrarTrabajador(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String rol, String activo) {
        String sqlQuery = "insert into trabajadores(nombre,apellido_paterno,apellido_materno,direccion,telefono,rol,activo) values (?,?.?,?,?,?,?)";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery) ) {
            ps.setString(1,nombre);
            ps.setString(2,apellidoPaterno);
            ps.setString(3,apellidoMaterno);
            ps.setString(4,direccion);
            ps.setString(5,telefono);
            ps.setString(6,rol);
            ps.setString(7,activo);
            ps.executeUpdate();
            System.out.println("Trabajador registrado correctamente");
        } catch(SQLException e) {
            System.out.println("Error al registrar trabajador./n"+e);
        } 
    }

  
    public int obtenerIdTrabajadorPorNombre(String nombre) {
        String sqlQuery = "select id_trabajador from trabajadores where nombre = ?";
        try {
            Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idTrabajador = rs.getInt("id_trabajador");
                return idTrabajador;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos.\n"+e);
            return -1;
        }
    }
}
