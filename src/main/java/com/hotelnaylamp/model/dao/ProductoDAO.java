package com.hotelnaylamp.model.dao;

import com.hotelnaylamp.model.entities.Producto;
import com.hotelnaylamp.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    public List<Producto> cargarProductos(){
        String sqlQuery = "select * from productos where activo = 'SI'";
        List<Producto> listaProductos = new ArrayList<>();
        try(Connection conexion = ConexionBD.getInstancia().getConexion();
            PreparedStatement ps = conexion.prepareStatement(sqlQuery)) {
            try(ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdProducto(rs.getInt("id_producto"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setPrecio(rs.getFloat("precio"));
                    listaProductos.add(producto);  
                }
            }
        } catch (SQLException e) {
            return null;
        }
        return listaProductos;
    }
}
