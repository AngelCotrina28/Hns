package com.hotelnaylamp.model.dao;

public class CategoriaDAO {
    
    /*public void registrarCategoria(String nombreCategoria, String descripcion, float precioBase) throws SQLException {
        Connection conexion = null;
        String sqlQuery = "insert into categorias(nombre_categoria,descripcion,precio_base) values(?,?,?)";
        PreparedStatement ps = null;
        
        try {
            conexion = ConexionBD.getInstancia().getConexion();
            ps = conexion.prepareStatement(sqlQuery);
            ps.setString(1, nombreCategoria);
            ps.setString(2, descripcion);
            ps.setFloat(3, precioBase);
            ps.executeUpdate();
            System.out.println("Categoria registrada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error : "+e);
        } finally {
            if ( conexion != null ) {
                conexion.close();
            }
            if ( ps != null ) {
                ps.close();
            }
        }
    }*/
    
}
