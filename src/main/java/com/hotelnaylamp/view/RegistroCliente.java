package com.hotelnaylamp.view;


import com.hotelnaylamp.controller.DetalleReservaController;
import com.hotelnaylamp.controller.ReservaController;
import com.hotelnaylamp.util.FechaConversorUtil;
import com.hotelnaylamp.util.Sesion;
import com.hotelnaylamp.view.Moldes.PanelRegistroCliente;
import java.awt.Frame;
import java.awt.Point;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroCliente extends javax.swing.JDialog {

    private DetalleReservaController detalleReservaController = new DetalleReservaController();
    private ReservaController reservaController = new ReservaController();
    
    //CONSTRUCTOR DE LA VISTA
    public RegistroCliente(Frame parent, boolean modal, int ancho, int alto, Point ubicacionVentana) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        
        txtNumeroReserva.setText(String.valueOf(reservaController.cargarIdReserva()));
        txtNombreTrabajador.setText(Sesion.getInstancia().getTrabajadorActivo().getNombre());
        
        cboMedioPago1.addActionListener(e -> {
            boolean hayDolares = cboMedioPago1.getSelectedItem().toString().equals("DOLARES") ||
                                 cboMedioPago2.getSelectedItem().toString().equals("DOLARES");
            txtTipoDeCambio.setVisible(hayDolares);
            lblTipoDeCambio.setVisible(hayDolares);
        });

        cboMedioPago2.addActionListener(e -> {
            boolean hayDolares = cboMedioPago1.getSelectedItem().toString().equals("DOLARES") ||
                                 cboMedioPago2.getSelectedItem().toString().equals("DOLARES");
            txtTipoDeCambio.setVisible(hayDolares);
            lblTipoDeCambio.setVisible(hayDolares);

            // Si elige NINGUNO en medio 2, deshabilita el monto 2
            boolean tieneSegundoMedio = !cboMedioPago2.getSelectedItem().toString().equals("NINGUNO");
            txtMonto2.setEnabled(tieneSegundoMedio);
            if(!tieneSegundoMedio) txtMonto2.setText("");
        });

        // Por defecto tipo de cambio oculto y monto2 deshabilitado
        txtTipoDeCambio.setVisible(false);
        lblTipoDeCambio.setVisible(false);
        txtMonto2.setEnabled(false);
        
        // Actualizar precio total cada vez que cambie la pestaña activa
        jTbdContenedorDatosHabitacion.addChangeListener(e -> {
            txtPrecioFinalReserva.setText(Float.toString(sumarPrecioFinalReserva()));
        });
        //----------------------------------------------------------------------
        
        //------------------------------------ACOMODAR VENTANA
        int posX = ubicacionVentana.x;
        int posY = ubicacionVentana.y;
        this.setSize(ancho, alto);
        this.setLocation(posX - (int) (posX*0.15), posY + (int) (posY*0.75));
        //----------------------------------------------------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbdContenedorDatosHabitacion = new javax.swing.JTabbedPane();
        pnlReservaFinal = new javax.swing.JPanel();
        btnCrearRegistro = new javax.swing.JButton();
        txtNumeroReserva = new javax.swing.JTextField();
        lblNumeroReserva = new javax.swing.JLabel();
        lblTrabajador = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        lblPrecioFinalACobrar = new javax.swing.JLabel();
        txtPrecioFinalReserva = new javax.swing.JTextField();
        lblMedioDePago = new javax.swing.JLabel();
        lblMedioPago1 = new javax.swing.JLabel();
        cboMedioPago1 = new javax.swing.JComboBox<>();
        lblMonto1 = new javax.swing.JLabel();
        txtMonto2 = new javax.swing.JTextField();
        lblMedioPago2 = new javax.swing.JLabel();
        cboMedioPago2 = new javax.swing.JComboBox<>();
        lblMonto2 = new javax.swing.JLabel();
        txtMonto1 = new javax.swing.JTextField();
        lblTipoDeCambio = new javax.swing.JLabel();
        txtTipoDeCambio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnCrearRegistro.setText("Crear Registro");
        btnCrearRegistro.addActionListener(this::btnCrearRegistroActionPerformed);

        txtNumeroReserva.setEditable(false);
        txtNumeroReserva.setColumns(8);
        txtNumeroReserva.setText("Nº Reserva");

        lblNumeroReserva.setText("Reserva Nº");

        lblTrabajador.setText("Trabajador:");

        txtNombreTrabajador.setEditable(false);
        txtNombreTrabajador.setColumns(10);
        txtNombreTrabajador.setText("Trabajador");

        lblPrecioFinalACobrar.setText("Precio Final a Cobrar: ");

        txtPrecioFinalReserva.setColumns(10);
        txtPrecioFinalReserva.setText("Precio Final Reserva");

        lblMedioDePago.setText("Medio de Pago");

        lblMedioPago1.setText("Medio 1: ");

        cboMedioPago1.setMaximumRowCount(10);
        cboMedioPago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA", "QR", "DOLARES" }));

        lblMonto1.setText("Monto:");

        txtMonto2.setColumns(10);

        lblMedioPago2.setText("Medio 2: ");

        cboMedioPago2.setMaximumRowCount(10);
        cboMedioPago2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "EFECTIVO", "TARJETA", "QR", "DOLARES" }));

        lblMonto2.setText("Monto:");

        txtMonto1.setColumns(10);

        lblTipoDeCambio.setText("Tipo de Cambio:");

        txtTipoDeCambio.setColumns(8);

        javax.swing.GroupLayout pnlReservaFinalLayout = new javax.swing.GroupLayout(pnlReservaFinal);
        pnlReservaFinal.setLayout(pnlReservaFinalLayout);
        pnlReservaFinalLayout.setHorizontalGroup(
            pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedioDePago)
                            .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                .addComponent(lblPrecioFinalACobrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioFinalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                        .addComponent(lblMedioPago1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboMedioPago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                        .addComponent(lblMedioPago2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboMedioPago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                        .addComponent(lblMonto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                                        .addComponent(lblMonto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaFinalLayout.createSequentialGroup()
                                .addComponent(lblNumeroReserva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(lblTrabajador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(pnlReservaFinalLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnCrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaFinalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTipoDeCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoDeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        pnlReservaFinalLayout.setVerticalGroup(
            pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservaFinalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDeCambio)
                    .addComponent(txtTipoDeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroReserva)
                    .addComponent(txtNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrabajador)
                    .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioFinalACobrar)
                    .addComponent(txtPrecioFinalReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(lblMedioDePago)
                .addGap(28, 28, 28)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedioPago1)
                    .addComponent(cboMedioPago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto1)
                    .addComponent(txtMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlReservaFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedioPago2)
                    .addComponent(cboMedioPago2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto2)
                    .addComponent(txtMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnCrearRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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
        int totalPestañas = jTbdContenedorDatosHabitacion.getTabCount();

        for (int i = 1; i < totalPestañas; i++) {

            PanelRegistroCliente panelActual = (PanelRegistroCliente) jTbdContenedorDatosHabitacion.getComponentAt(i);
            
            String errorCritico = panelActual.validarErroresCriticos();
        
            if (errorCritico != null) {
                JOptionPane.showMessageDialog(this,"Error en Hab: " + panelActual.getHabitacionAsignada() + 
                                                ":\n" + errorCritico, "No se puede guardar", JOptionPane.ERROR_MESSAGE);
                jTbdContenedorDatosHabitacion.setSelectedIndex(i); // Enviamos al usuario a la pestaña del error
                return;
            }
        }

        for (int i = 1; i < totalPestañas; i++) {
            PanelRegistroCliente panelActual = (PanelRegistroCliente) jTbdContenedorDatosHabitacion.getComponentAt(i);
            String advertencia = panelActual.verificarAdvertencias();

            if (advertencia != null) {
                jTbdContenedorDatosHabitacion.setSelectedIndex(i); // Mostramos la pestaña en cuestión

                // Usamos un ConfirmDialog para que el usuario decida (Sí o No)
                int respuesta = JOptionPane.showConfirmDialog(this, advertencia, "Aviso de Registro", 
                                                                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);

                if (respuesta != JOptionPane.YES_OPTION) {
                    return; // 🛑 DETENEMOS TODO
                }
            }
        }
        
        String errorPago = reservaController.validarMediosPago(txtMonto1.getText(),txtMonto2.getText(),
                                cboMedioPago2.getSelectedItem().toString(),txtPrecioFinalReserva.getText());
        if(errorPago != null) {
            JOptionPane.showMessageDialog(this, errorPago, 
                "Error en Medio de Pago", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("exitoso");
            /*//Revisar Fecha ingreso y salida -------------------
            LocalDateTime fechaEntradaSalida = panelActual.obtenerFechaEntrada(); //se usa la misma variable
            String fechaTexto = FechaConversorUtil.convertirFechaBD(fechaEntradaSalida);
            System.out.println(fechaTexto);
            
            fechaEntradaSalida = panelActual.establecerFechaSalida();
            fechaTexto = FechaConversorUtil.convertirFechaBD(fechaEntradaSalida);
            System.out.println(fechaTexto);
            //----------------------------------------------------*/
    }//GEN-LAST:event_btnCrearRegistroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea cerrar la ventana de reserva?");
        if(respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRegistro;
    private javax.swing.JComboBox<String> cboMedioPago1;
    private javax.swing.JComboBox<String> cboMedioPago2;
    private javax.swing.JTabbedPane jTbdContenedorDatosHabitacion;
    private javax.swing.JLabel lblMedioDePago;
    private javax.swing.JLabel lblMedioPago1;
    private javax.swing.JLabel lblMedioPago2;
    private javax.swing.JLabel lblMonto1;
    private javax.swing.JLabel lblMonto2;
    private javax.swing.JLabel lblNumeroReserva;
    private javax.swing.JLabel lblPrecioFinalACobrar;
    private javax.swing.JLabel lblTipoDeCambio;
    private javax.swing.JLabel lblTrabajador;
    private javax.swing.JPanel pnlReservaFinal;
    private javax.swing.JTextField txtMonto1;
    private javax.swing.JTextField txtMonto2;
    private javax.swing.JTextField txtNombreTrabajador;
    private javax.swing.JTextField txtNumeroReserva;
    private javax.swing.JTextField txtPrecioFinalReserva;
    private javax.swing.JTextField txtTipoDeCambio;
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
    
    javax.swing.JLabel lblTitulo = new javax.swing.JLabel("Hab: " + numeroHabitacion + "  ");
    javax.swing.JButton btnX = new javax.swing.JButton("x");
    
    // Hacemos el botón pequeñito y sin bordes feos
    btnX.setMargin(new java.awt.Insets(0, 5, 0, 5)); 
    btnX.setBorderPainted(false);
    btnX.setContentAreaFilled(false);
    
    // 3. Le damos la orden de eliminar al botón X ❌
    btnX.addActionListener(evt -> {
        int resultado = JOptionPane.showConfirmDialog(this,"¿Desea eliminar habitacion "+numeroHabitacion+"\n   de la reserva?");
        if(resultado == JOptionPane.YES_OPTION){
            jTbdContenedorDatosHabitacion.remove(nuevaHabitacion);
            if(jTbdContenedorDatosHabitacion.getTabCount() == 1) {
            dispose();
            }
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

    public boolean verificarHabitacionInstanciada(String numeroHabitacion) {
        int numero = Integer.parseInt(numeroHabitacion);
        for(int i = 1; i < jTbdContenedorDatosHabitacion.getTabCount(); i++) {
            PanelRegistroCliente panel = (PanelRegistroCliente) 
                jTbdContenedorDatosHabitacion.getComponentAt(i);
            if(panel.getHabitacionAsignada() == numero) {
                JOptionPane.showMessageDialog(null,"Habitacion " + numeroHabitacion + " ya esta seleccionada.","Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
     
    public float sumarPrecioFinalReserva() {
        // La vista extrae los valores de cada panel
        ArrayList<Float> cantidades = new ArrayList<>();
        for(int i = 1; i < jTbdContenedorDatosHabitacion.getTabCount(); i++){
            PanelRegistroCliente panel = (PanelRegistroCliente) jTbdContenedorDatosHabitacion.getComponentAt(i);
            cantidades.add(panel.convertirCantidadPagada());
        }
        // El controller hace el cálculo
        return detalleReservaController.sumarPrecioFinalReserva(cantidades);
    }
    
    public String getMedio1() { 
        return cboMedioPago1.getSelectedItem().toString(); 
    }
    public String getMedio2() { 
        return cboMedioPago2.getSelectedItem().toString(); 
    }
    public float getMonto1() { 
        return Float.parseFloat(txtMonto1.getText()); 
    }
    public float getMonto2() {
        if(cboMedioPago2.getSelectedItem().toString().equals("NINGUNO")) return 0;
        return Float.parseFloat(txtMonto2.getText()); 
    }
    public float getTipoCambio() {
        if(!txtTipoDeCambio.isVisible()) return 1;
        return Float.parseFloat(txtTipoDeCambio.getText());
    }
}




