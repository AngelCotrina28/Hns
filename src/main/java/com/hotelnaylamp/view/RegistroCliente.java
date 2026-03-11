package com.hotelnaylamp.view;


import com.hotelnaylamp.util.FechaConversorUtil;
import com.hotelnaylamp.view.Moldes.PanelRegistroCliente;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class RegistroCliente extends javax.swing.JDialog {

 
    
//CONSTRUCTOR DE LA VISTA
    public RegistroCliente(Frame parent, boolean modal, int ancho, int alto, Point ubicacionVentana) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        
        //------------------------------------ACOMODAR VENTANA
        int posX = ubicacionVentana.x;
        int posY = ubicacionVentana.y;
        this.setSize(ancho, alto);
        this.setLocation(posX - (int) (posX*0.15), posY + (int) (posY*0.75));
        //-------------------------------------------------------------------------------------

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbdContenedorDatosHabitacion = new javax.swing.JTabbedPane();
        pnlReservaFinal = new javax.swing.JPanel();
        btnCrearRegistro = new javax.swing.JButton();
        txtNumeroReserva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioFinalReserva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTbdContenedorDatosHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbdContenedorDatosHabitacionMouseClicked(evt);
            }
        });
        jTbdContenedorDatosHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbdContenedorDatosHabitacionKeyPressed(evt);
            }
        });

        btnCrearRegistro.setText("Crear Registro");
        btnCrearRegistro.addActionListener(this::btnCrearRegistroActionPerformed);

        txtNumeroReserva.setEditable(false);
        txtNumeroReserva.setText("Numero Reserva");

        jLabel1.setText("Reserva Nº");

        jLabel2.setText("Trabajador:");

        txtNombreTrabajador.setEditable(false);
        txtNombreTrabajador.setText("Trabajador");

        jLabel3.setText("Precio Final a Cobrar: ");

        txtPrecioFinalReserva.setColumns(10);
        txtPrecioFinalReserva.setText("Precio Final Reserva");

        javax.swing.GroupLayout pnlReservaFinalLayout = new javax.swing.GroupLayout(pnlReservaFinal);
        pnlReservaFinal.setLayout(pnlReservaFinalLayout);
        pnlReservaFinalLayout.setHorizontalGroup(
            pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaFinalLayout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addComponent(btnCrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioFinalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlReservaFinalLayout.setVerticalGroup(
            pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaFinalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioFinalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(btnCrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTbdContenedorDatosHabitacion.addTab("Detalle Total Reserva", pnlReservaFinal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTbdContenedorDatosHabitacion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTbdContenedorDatosHabitacion)
        );

        jTbdContenedorDatosHabitacion.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//BOTON CREAR REGISTRO ------------------------------------------------------------------
    private void btnCrearRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRegistroActionPerformed
        int cantidadHabitaciones = jTbdContenedorDatosHabitacion.getTabCount();

        for (int i = 1; i < cantidadHabitaciones; i++) {

            PanelRegistroCliente panelActual = (PanelRegistroCliente) jTbdContenedorDatosHabitacion.getComponentAt(i);
            
            LocalDateTime fechaEntradaSalida = panelActual.obtenerFechaEntrada(); //se usa la misma variable
            String fechaTexto = FechaConversorUtil.convertirFechaBD(fechaEntradaSalida);
            System.out.println(fechaTexto);
            
            fechaEntradaSalida = panelActual.establecerFechaSalida();
            fechaTexto = FechaConversorUtil.convertirFechaBD(fechaEntradaSalida);
            System.out.println(fechaTexto);
        }
    }//GEN-LAST:event_btnCrearRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea cerrar la ventana de reserva?");
        if(respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTbdContenedorDatosHabitacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbdContenedorDatosHabitacionKeyPressed
       
    }//GEN-LAST:event_jTbdContenedorDatosHabitacionKeyPressed

    private void jTbdContenedorDatosHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbdContenedorDatosHabitacionMouseClicked
        txtPrecioFinalReserva.setText(Float.toString(sumarPrecioFinalReserva()));
    }//GEN-LAST:event_jTbdContenedorDatosHabitacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTbdContenedorDatosHabitacion;
    private javax.swing.JPanel pnlReservaFinal;
    private javax.swing.JTextField txtNombreTrabajador;
    private javax.swing.JTextField txtNumeroReserva;
    private javax.swing.JTextField txtPrecioFinalReserva;
    // End of variables declaration//GEN-END:variables


    public void añadirHabitacionAReserva(String numeroHabitacion) {
    // 1. Añadimos la pestaña de la forma normal
    int habitacionAsignada = Integer.parseInt(numeroHabitacion);
    PanelRegistroCliente nuevaHabitacion = new PanelRegistroCliente(habitacionAsignada);
    jTbdContenedorDatosHabitacion.addTab("Hab: "+numeroHabitacion, nuevaHabitacion);
    
    // Obtenemos en qué posición (índice) quedó esta nueva pestaña
    int indice = jTbdContenedorDatosHabitacion.indexOfComponent(nuevaHabitacion);
    
    // 2. Fabricamos el "mini-panel" para la cabecera 🏷️
    javax.swing.JPanel pnlCabecera = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
    pnlCabecera.setOpaque(false); // Transparente para que se vea el fondo de la pestaña
    
    javax.swing.JLabel lblTitulo = new javax.swing.JLabel("Hab" + numeroHabitacion + "  ");
    javax.swing.JButton btnX = new javax.swing.JButton("x");
    
    // Hacemos el botón pequeñito y sin bordes feos
    btnX.setMargin(new java.awt.Insets(0, 5, 0, 5)); 
    btnX.setBorderPainted(false);
    btnX.setContentAreaFilled(false);
    
    // 3. Le damos la orden de eliminar al botón X ❌
    btnX.addActionListener(evt -> {
        int resultado = JOptionPane.showConfirmDialog(this,"¿Desea eliminar habitacion "+numeroHabitacion+"\n   de la reserva?");
        if(resultado == JOptionPane.YES_OPTION){
            System.out.println(jTbdContenedorDatosHabitacion.getTabCount());
            System.out.println();
            jTbdContenedorDatosHabitacion.remove(nuevaHabitacion);
            if(jTbdContenedorDatosHabitacion.getTabCount() == 1) {
            dispose();
            }
            txtPrecioFinalReserva.setText(Float.toString(sumarPrecioFinalReserva()));
        }
        
    });
    
    // Armamos el mini-panel
    pnlCabecera.add(lblTitulo);
    pnlCabecera.add(btnX);
    
    // 4. ¡La magia! Reemplazamos la cabecera aburrida por nuestro mini-panel ✨
    jTbdContenedorDatosHabitacion.setTabComponentAt(indice, pnlCabecera);
    
    int indiceNuevaPestaña = jTbdContenedorDatosHabitacion.getTabCount() - 1;
    jTbdContenedorDatosHabitacion.setSelectedIndex(indiceNuevaPestaña);
    }

    public int verificarHabitacionInstanciada(String numeroHabitacion) {
        String nombrePestaña = "Hab: "+numeroHabitacion;
        for( int i = 0 ; i < jTbdContenedorDatosHabitacion.getTabCount() ; i++) {
            if( nombrePestaña.equals(jTbdContenedorDatosHabitacion.getTitleAt(i) )) {
                JOptionPane.showMessageDialog(null,"Habitacion "+numeroHabitacion+ " ya esta seleccionada.","Error",JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        }
        return 1;
    }
     
    public float sumarPrecioFinalReserva() {
        float precioFinalAPagar = 0;
        for(int i = 1; i <jTbdContenedorDatosHabitacion.getTabCount(); i++){
            Component componente = jTbdContenedorDatosHabitacion.getComponentAt(i);
            PanelRegistroCliente instanciaPanel = (PanelRegistroCliente) componente;
            precioFinalAPagar = precioFinalAPagar + instanciaPanel.obtenerCantidadPagada(); 
        }
        return precioFinalAPagar;
    }
    
    
   
}




