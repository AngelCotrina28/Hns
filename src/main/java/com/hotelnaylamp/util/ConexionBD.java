package com.hotelnaylamp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static ConexionBD instancia;
    private static final String usuario = "angel";
    private static final String url = "jdbc:mysql://localhost:3306/hotel_naylamp_bd";
    private static final String contraseña = "KazumiyAngelps11!";

    private ConexionBD() {
        // Constructor privado para el Singleton
    }

    public static ConexionBD getInstancia() {
        if(instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    // Ahora crea una conexión nueva cada vez que se llama
    public Connection getConexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}