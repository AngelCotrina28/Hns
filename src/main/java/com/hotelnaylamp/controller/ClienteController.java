package com.hotelnaylamp.controller;

import com.hotelnaylamp.model.dao.ClienteDAO;
import com.hotelnaylamp.model.entities.Cliente;


public class ClienteController {
    
    private ClienteDAO clienteDAO = new ClienteDAO();
    
    public String validarDatosCliente(String tipoDocumento, String documento, String nombre, String apellidoPaterno, 
                                    String apellidoMaterno, String direccion) {
        
        
        if(documento.equals("Documento") || documento.equals("")){
            return "Numero de Documento Invalido";
        }
        
        if(nombre.equals("Nombre") || nombre.equals("")){
            return "Campo Nombre es Invalido";
        }
        
        if(apellidoPaterno.equals("A. Paterno") || apellidoPaterno.equals("")){
            return "Campo Apellido Paterno es Invalido";
        }
        
        if(apellidoMaterno.equals("A. Materno") || apellidoMaterno.equals("")){
            return "Campo Apellido Materno es Invalido";
        }
        
        if(direccion.equals("Direccion") || direccion.equals("")){
            return "Campo Direccion es invalido Invalido";
        }
        
                if(tipoDocumento.equals("DNI")){
            if(documento.length()!=8){
                return "Numero de Documento Invalido";
            }
        }
        
        if(tipoDocumento.equals("CE")){
            if(documento.length()!=9){
                return "Numero de Documento Invalido";
            }
        }
        
        if(tipoDocumento.equals("PTP")){
            if(documento.length()<6){
                return "Numero de Documento Invalido";
            }
        }
        
        return null;
    }
    
    public Cliente crearCliente(String tipoDocumento, String documento, String nombre,
                             String apellidoPaterno, String apellidoMaterno,
                             String direccion, String departamento, 
                             String provincia, String distrito, String nacionalidad){
        return new Cliente(tipoDocumento, documento, nombre, 
                       apellidoPaterno, apellidoMaterno,
                       direccion, departamento, provincia, distrito, nacionalidad);
    }
    
    public void actualizarDatosCliente(Cliente clienteAActualizar, String tipoDocumento, 
                                String documento, String nombre, String apellidoPaterno,
                                String apellidoMaterno, String direccion, 
                                String departamento, String provincia, 
                                String distrito, String nacionalidad) {
        // El controller aplica los setters, no la vista
        clienteAActualizar.setTipoDocumento(tipoDocumento);
        clienteAActualizar.setDocumento(documento);
        clienteAActualizar.setNombre(nombre);
        clienteAActualizar.setApellidoPaterno(apellidoPaterno);
        clienteAActualizar.setApellidoMaterno(apellidoMaterno);
        clienteAActualizar.setDireccion(direccion);
        clienteAActualizar.setDepartamento(departamento);
        clienteAActualizar.setProvincia(provincia);
        clienteAActualizar.setDistrito(distrito);
        clienteAActualizar.setNacionalidad(nacionalidad);
    }
    
    public int obtenerLongitudMaximaDocumento(String tipoDocumento) {
        switch(tipoDocumento) {
            case "DNI": return 8;
            case "CE":  return 9;
            case "PTP": return 10;
            default:    return 10;
        }
    }
    
    public int obtenerLongitudMinimaBusqueda(String tipoDocumento) {
    switch(tipoDocumento) {
        case "DNI": return 8;  // busca exactamente en 8
        case "CE":  return 9;  // busca exactamente en 9
        case "PTP": return 6;  // busca a partir de 5
        default:    return 6;
    }
}
    
    public boolean esNacionalidadEditable(String tipoDocumento) {
        // Si es DNI, la persona es peruana — nacionalidad no editable
        return !tipoDocumento.equals("DNI");
    }
    
    public Cliente buscarClientePorDocumento(String documento, String tipoDocumento) {
        return clienteDAO.buscarCliente(documento,tipoDocumento);
    }
}
