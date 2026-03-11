package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.model.entities.Reserva;
import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ReservaDAO {
    /*public void registrarReserva(int idCliente,int idHabitacion, int idTrabajador, LocalDateTime fechaEntrada,long horas, float precioFinal, float cantidadPagada, String estadoReserva) {
        String sqlQuery = "insert into reservas(id_cliente,id_habitacion,id_trabajador,fecha_entrada,fecha_salida,precio_final,cantidad_pagada,estado_reserva) values (?,?,?,?,?,?,?,?)";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery)) {
            ps.setInt(1,idCliente);
            ps.setInt(2,idHabitacion);
            ps.setInt(3,idTrabajador);   
            ps.setString(4,FechaConversorUtil.convertirFechaBD(fechaEntrada,0));
            ps.setString(5, FechaConversorUtil.convertirFechaBD(fechaEntrada, horas));
            ps.setFloat(6,precioFinal);
            ps.setFloat(7,cantidadPagada);
            ps.setString(8,estadoReserva);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al crear la reserva.\n"+e);
        }
    }*/
    
   /* public void registrarReserva(Reserva reserva) {
        String sqlQuery = "insert into reservas(id_cliente1,id_cliente2,id_habitacion,id_trabajador,fecha_entrada,fecha_salida,precio_final,cantidad_pagada,estado_reserva) values (?,?,?,?,?,?,?,?)";
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery)) {
            ps.setInt(1,reserva.getIdCliente1());
            ps.setInt(2,reserva.getIdCliente2());
            ps.setInt(3,reserva.getIdHabitacion());
            ps.setInt(4,reserva.getIdTrabajador());   
            ps.setObject(5,reserva.getFechaEntrada());
            ps.setObject(6,reserva.getFechaSalida());
            ps.setFloat(7,reserva.getPrecioFinal());
            ps.setFloat(8,reserva.getCantidadPagada());
            ps.setString(9,reserva.getEstadoReserva());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al crear la reserva.\n"+e);
        }
    }*/
}

