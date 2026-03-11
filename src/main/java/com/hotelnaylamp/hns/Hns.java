package com.hotelnaylamp.hns;


import com.hotelnaylamp.view.MenuPrincipal;
import java.sql.SQLException;


public class Hns {
    public static void main(String[] args) throws SQLException {
    MenuPrincipal pantalla = new MenuPrincipal();
    pantalla.setTitle("Casa Naylamp / Sistema de Hotel Naylamp");
    pantalla.setVisible(true);
    }
}
