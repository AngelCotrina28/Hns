package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ProductoDAO;
import com.hotelnaylamp.model.entities.Producto;
import java.util.List;

public class ProductoController {
    private ProductoDAO productoDao = new ProductoDAO();
    
    
    public List<Producto> cargarProductos(){
        return productoDao.cargarProductos();
    }
    
    
    
}
