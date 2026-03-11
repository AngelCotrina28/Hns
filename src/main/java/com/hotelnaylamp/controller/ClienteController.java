package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ClienteDAO;
import com.hotelnaylamp.model.entities.Cliente;


public class ClienteController {
    
    private ClienteDAO clienteDAO = new ClienteDAO();
    
    
    
    public Cliente buscarClientePorDocumento(String documento, String tipoDocumento) {
        return clienteDAO.buscarCliente(documento,tipoDocumento);
    }
}
