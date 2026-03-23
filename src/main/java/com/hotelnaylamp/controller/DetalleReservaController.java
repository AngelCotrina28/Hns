package com.hotelnaylamp.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class DetalleReservaController {
    private HabitacionController habitacionController = new HabitacionController();
    
    //SOBRE ID_RESERVA----------------------------------------------------------
    
    //-------------------------------------------------------------------------- 
    //SOBRE FECHA ENTRADA-------------------------------------------------------
    public LocalDateTime obtenerFechaEntrada(String tipoFechaEntrada, 
                                            int dia, int mes, int anio, String horaManual) {
        if(tipoFechaEntrada.equals("Hora del Sistema")) {
            // Usa la fecha y hora actual del sistema
            LocalDate fechaHoy = LocalDate.now();
            LocalTime horaIngreso = LocalTime.now().withSecond(0).withNano(0);
            return LocalDateTime.of(fechaHoy, horaIngreso);
        } else {
            // Construye la fecha y hora con los valores manuales del usuario
            LocalDate fechaManual = LocalDate.of(anio, mes, dia);
            // La hora viene en formato "22:00" o "9:30"
            String[] partes = horaManual.split(":");
            LocalTime horaIngreso = LocalTime.of(
                Integer.parseInt(partes[0]), 
                Integer.parseInt(partes[1])
            );
            return LocalDateTime.of(fechaManual, horaIngreso);
        }
    }
    
    //--------------------------------------------------------------------------
    //SOBRE FECHA SALIDA--------------------------------------------------------
    public LocalDateTime establecerFechaSalida(String tipoFechaEntrada, String tipoFechaSalida,
                                                String hora, String dia, String mes,
                                                int numeroHabitacion,
                                                int diaEntrada, int mesEntrada, 
                                                int anioEntrada, String horaEntradaManual,
                                                int diaSalida, int mesSalida, 
                                                int anioSalida, String horaSalidaManual) {
        if(tipoFechaSalida.equals("Predeterminado")) {
            // Calcula la salida sumando el tiempo reservado a la entrada
            LocalDateTime fechaEntrada = obtenerFechaEntrada(
                tipoFechaEntrada, diaEntrada, mesEntrada, anioEntrada, horaEntradaManual
            );
            LocalDateTime fechaSalida = fechaEntrada;

            if(!hora.equals("0")) {
                fechaSalida = fechaSalida.plusHours(Long.parseLong(hora));
            }
            if(!dia.equals("0")) {
                fechaSalida = fechaSalida.plusDays(Long.parseLong(dia));
            }
            if(!mes.equals("0")) {
                fechaSalida = fechaSalida.plusMonths(Long.parseLong(mes));
            }
            return fechaSalida;
        } else {
            // El usuario ingresó la fecha y hora de salida manualmente
            LocalDate fechaManual = LocalDate.of(anioSalida, mesSalida, diaSalida);
            String[] partes = horaSalidaManual.split(":");
            LocalTime horaManual = LocalTime.of(
                Integer.parseInt(partes[0]),
                Integer.parseInt(partes[1])
            );
            return LocalDateTime.of(fechaManual, horaManual);
        }
    }
    //--------------------------------------------------------------------------
    //SOBRE PRECIO_HABITACION---------------------------------------------------
    public String validarPrecioHabitacion(String precio, int numeroHabitacion){
        try {
            float precioTotalAPagar = Float.parseFloat(precio);
            return null;
        } catch (NumberFormatException e) {
            return "Precio de Hab: "+numeroHabitacion+" Invalido.";
        }
    }
    
    public String obtenerPrecioInicial(int numeroHabitacion) {
        return habitacionController.obtenerPrecioHabitacion(Integer.toString(numeroHabitacion));
    }
    
    //--------------------------------------------------------------------------
    //SOBRE CANTIDAD_PAGADA-----------------------------------------------------
    public String validarCantidadPagadaHabitacion(String cantidadPagada, int numeroHabitacion, String precio){
        try {
            float cantidadAPagar = Float.parseFloat(cantidadPagada);
            float precioHabitacion = Float.parseFloat(precio);

            if(cantidadAPagar < 0) {
                return "Cantidad pagada de Hab: "+numeroHabitacion+" no puede ser negativa.";
            }

            if(cantidadAPagar > precioHabitacion) {
                return "Cantidad pagada de Hab: "+numeroHabitacion+" no puede superar el precio.";
            }
            return null;
        } catch (NumberFormatException e) {
            return "Cantidad pagada de Hab: "+numeroHabitacion+" Invalida.";
        }
    }
    
    public float sumarPrecioFinalReserva(ArrayList<Float> cantidadesPagadas) {
        float total = 0;
        for(Float cantidad : cantidadesPagadas) {
            total += cantidad;
        }
        return total;
    }
    //--------------------------------------------------------------------------
    //OTROS---------------------------------------------------------------------
    public String validarTiempoReservado(String hora, String dia, String mes, int numeroHabitacion) {
        try {
            if(!(hora.equals("0") && dia.equals("0") && mes.equals("0"))) {
                Long.parseLong(hora);
                Long.parseLong(dia);
                Long.parseLong(mes);
                return null;
            }else{
                return "Hab. "+numeroHabitacion+" necesita algun \ntiempo de reserva.";
            }
        } catch (NumberFormatException e) {
            return "Hab: "+numeroHabitacion+" Error con \ntiempo de reserva.";
        }
    }
    

    //--------------------------------------------------------------------------
    

    
    
    
    
    
    
    
    

}
