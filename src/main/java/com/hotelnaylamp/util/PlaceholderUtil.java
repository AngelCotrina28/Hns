package com.hotelnaylamp.util;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class PlaceholderUtil {

    // Este método recibe CUALQUIER campo de texto y su placeholder
    // y le agrega el comportamiento automáticamente
    public static void aplicar(JTextField campo, String placeholder) {
        
        // Le ponemos el texto placeholder al inicio
        campo.setText(placeholder);
        
        // Cuando el campo gana el foco, borramos el placeholder
        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(placeholder)) {
                    campo.setText("");
                }
            }
            
            // Cuando el campo pierde el foco, restauramos el placeholder
            // solo si el usuario no escribió nada
            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().equals("")) {
                    campo.setText(placeholder);
                }
            }
        });
    }
}