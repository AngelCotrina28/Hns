package com.hotelnaylamp.service;

import com.hotelnaylamp.model.dao.ClienteDAO;
import com.hotelnaylamp.model.dao.HabitacionDAO;
import com.hotelnaylamp.model.dao.ReservaDAO;
import com.hotelnaylamp.model.dao.TrabajadorDAO;
import com.hotelnaylamp.model.entities.Reserva;
import java.time.DateTimeException;
import java.time.LocalDateTime;

public class ReservaService {
    
    private ReservaDAO reservaDao;
    private ClienteDAO clienteDao;
    private HabitacionDAO habitacionDao;
    private TrabajadorDAO trabajadorDao;
    
    public ReservaService() {
        this.reservaDao = new ReservaDAO();
        this.clienteDao = new ClienteDAO();
        this.habitacionDao = new HabitacionDAO();
        this.trabajadorDao = new TrabajadorDAO();
    }
    
    /*public void registrarReserva(Reserva reserva, String numeroIdentificacion,String numeroHabitacion,String nombreTrabajador, long horas) {
        int idCliente1 = clienteDao.obtenerIdClientePorNumeroIdentificacion(numeroIdentificacion);
        int idCliente2 = clienteDao.obtenerIdClientePorNumeroIdentificacion(numeroHabitacion)
        int idHabitacion = habitacionDao.obtenerIdHabitacionPorNumeroHabitacion(numeroHabitacion);
        int idTrabajador = trabajadorDao.obtenerIdTrabajadorPorNombre(nombreTrabajador);
        reserva.setIdCliente(idCliente);
        reserva.setIdHabitacion(idHabitacion);
        reserva.setIdTrabajador(idTrabajador);
        try {
            LocalDateTime fechaAux = reserva.getFechaEntrada();
            reserva.setFechaSalida(fechaAux.plusHours(horas));
        } catch (DateTimeException e) {
            System.out.println("Error al crear fecha de salida.\n"+e);
        }
    }*/
}
