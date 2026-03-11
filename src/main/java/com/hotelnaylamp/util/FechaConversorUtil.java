package com.hotelnaylamp.util;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FechaConversorUtil {
    
    private FechaConversorUtil() {
    }
    
    public static String convertirFechaBD(LocalDateTime fecha) {
        try {
            DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String newFecha = fecha.format(fechaFormatter);
            return newFecha;    
        } catch (DateTimeException e) {
            return "Error con la fecha de ingreso o salida.\n"+e;
        }
    }
}
