package com.hotelnaylamp.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBD {
    private static ConexionBD instancia;
    private static final String usuario = "angel";
    private static final  String url = "jdbc:mysql://localhost:3306/hotel_naylamp_bd";
    private static final String contraseña = "KazumiyAngelps11!";
    private static Connection conexion;

    public static Connection getConexion() {
        return conexion;
    }
    
    //Singleton
    private ConexionBD() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion Exitosa.");
        } catch (Exception e) {
            System.out.println("Error en conectar la base de datos...");
            System.out.println(e);
        }
        
    }
    
    public static ConexionBD getInstancia() {
        if ( instancia == null ) {
            instancia = new ConexionBD();
        }
        return instancia;
    }
    
}
