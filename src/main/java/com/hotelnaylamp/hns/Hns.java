package com.hotelnaylamp.hns;


import com.hotelnaylamp.util.Sesion;
import com.hotelnaylamp.view.Login;
import com.hotelnaylamp.view.MenuPrincipal;


public class Hns {
    public static void main(String[] args) {
        
        Login login = new Login(null,true);
        login.inicializarLogin();
        
        
        
        if(Sesion.getInstancia().getTrabajadorActivo() != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setTitle("Casa Naylamp / Sistema de Hotel Naylamp");
            menu.setVisible(true);
        }
        
        
        
  
        
        
        /*String pw = BCrypt.hashpw("AmoAKazumi",BCrypt.gensalt());
        System.out.println(pw);*/
    }
    
    
    
    
    
}
