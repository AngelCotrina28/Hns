package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.model.entities.Trabajador;
import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class TrabajadorDAO {
  
    public String registrarTrabajador(String nombre, String apellidoPaterno, String apellidoMaterno, 
                                    String direccion, String telefono, String rol, String activo,
                                    String usuario, String contraseña) {
        String sqlQuery = "insert into trabajadores(nombre,apellido_paterno,apellido_materno,direccion,"
                                        + "telefono,rol,activo,usuario,contraseña) values (?,?,?,?,?,?,?,?,?)";
        String contraseñaEncriptadaEnBD = BCrypt.hashpw(contraseña,BCrypt.gensalt());
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery)) {
            ps.setString(1,nombre);
            ps.setString(2,apellidoPaterno);
            ps.setString(3,apellidoMaterno);
            ps.setString(4,direccion);
            ps.setString(5,telefono);
            ps.setString(6,rol);
            ps.setString(7,activo);
            ps.setString(8,usuario);
            ps.setString(9,contraseñaEncriptadaEnBD);
            ps.executeUpdate();
            return null;
        } catch(SQLException e) {
            return "Error al Registrar Trabajador.\nError tipo (TDAO): "+e;
        } 
    }

    
    public Trabajador buscarTrabajadorPorCredenciales(String usuarioIngresado, String contraseñaIngresada){
        String sqlQuery = "select contraseña, id_trabajador, nombre, apellido_paterno, rol from trabajadores "
                            + "where usuario = ? and activo = 'SI' ";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery)) {
            ps.setString(1, usuarioIngresado);
            try(ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String contraseñaEncriptadaEnBD = rs.getString("contraseña");
                    if(BCrypt.checkpw(contraseñaIngresada,contraseñaEncriptadaEnBD)){
                        Trabajador trabajador = new Trabajador();
                        trabajador.setIdTrabajador(rs.getInt("id_trabajador"));
                        trabajador.setNombre(rs.getString("nombre"));
                        trabajador.setApellidoPaterno(rs.getString("apellido_paterno"));
                        trabajador.setRol(rs.getString("rol"));
                        return trabajador;
                    }
                }
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al Inicio de Sesion: "+e);
            return null;
        }
    }
    
}
