package com.hotelnaylamp.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class CampoNumericoUtil {
    // Igual que PlaceholderUtil, el método es static para usarlo sin instanciar la clase
    public static void soloNumeros(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char tecla = e.getKeyChar();
                // Si la tecla no es un dígito, la consumimos — no aparece en el campo
                if (!Character.isDigit(tecla)) {
                    e.consume();
                }
            }
        });
    }
    
    // Permite dígitos Y el punto decimal, pero solo un punto por campo
    public static void soloNumerosDecimales(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char tecla = e.getKeyChar();

                // Permitimos dígitos normalmente
                if (Character.isDigit(tecla)) {
                    return;
                }

                // Permitimos el punto decimal, pero solo si no hay uno ya
                if (tecla == '.' && !campo.getText().contains(".")) {
                    return;
                }

                // Todo lo demás lo bloqueamos
                e.consume();
            }
        });
    }
}
