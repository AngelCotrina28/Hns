package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.model.entities.Cliente;
import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {
    public int registrarCliente(Cliente cliente) {
        String sqlQuery = "insert into clientes(tipo_documento,documento,nombre,apellido_paterno,apellido_materno,"
                + "direccion,nacionalidad) values (?,?,?,?,?,?,?)";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery,Statement.RETURN_GENERATED_KEYS)) { 
            ps.setString(1,cliente.getTipoDocumento());
            ps.setString(2,cliente.getDocumento());
            ps.setString(3,cliente.getNombre());
            ps.setString(4,cliente.getApellidoPaterno());
            ps.setString(5,cliente.getApellidoMaterno());
            ps.setString(6,cliente.getDireccion());
            ps.setString(7,cliente.getNacionalidad());
            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if ( rs.next() ) {
                    int idGenerado = rs.getInt(1);
                    System.out.println("Cliente registrado correctamente.");
                    return idGenerado;
                } else {
                    return -1;
                }
            } catch (SQLException e) {
                System.out.println(e);
                return -1;
            }
        } catch(SQLException e) {
            System.out.println(e);
            return -1;
        } 
    }
    
    /*public int obtenerIdClientePorDocumento(String documento, int cantidadClientes) {
        String sqlQuery = "select id_cliente from clientes where numero_identificacion = ?";
        try { 
            Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1,documento);
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                int idCliente = rs.getInt("id_cliente");
                return idCliente;
            } else {
                System.out.println("El cliente no esta registrado.");
                return -1;
            } 
        } catch(SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos.\n"+e);
            return -1;
        }   
    }*/
    
    public Cliente buscarCliente(String documento, String tipoDocumento) {
        String sqlQuery = "select * from clientes where documento = ? and tipo_documento = ?";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps  = conexion.prepareCall(sqlQuery)) {
            ps.setString(1, documento);
            ps.setString(2, tipoDocumento);
            try(ResultSet rs = ps.executeQuery();) {
                if( rs.next() ) {
                    Cliente clienteEncontrado = new Cliente();
                    clienteEncontrado.setNombre(rs.getString("nombre"));
                    clienteEncontrado.setApellidoPaterno(rs.getString("apellido_paterno"));
                    clienteEncontrado.setApellidoMaterno(rs.getString("apellido_materno"));
                    clienteEncontrado.setDireccion(rs.getString("direccion"));
                    clienteEncontrado.setDepartamento(rs.getString("departamento"));
                    clienteEncontrado.setProvincia(rs.getString("provincia"));
                    clienteEncontrado.setDistrito(rs.getString("distrito"));
                    clienteEncontrado.setNacionalidad(rs.getString("nacionalidad"));
                    return clienteEncontrado;
                } 
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: "+e);
            return null;
        }
    }
}
