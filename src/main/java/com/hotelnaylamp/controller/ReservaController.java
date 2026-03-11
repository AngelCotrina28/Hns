package com.hotelnaylamp.controller;

import com.hotelnaylamp.service.ReservaService;

public class ReservaController {
    
    private ReservaService reservaService;
    
    public ReservaController(){
        this.reservaService = new ReservaService();
    }
}
