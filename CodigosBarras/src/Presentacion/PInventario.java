package Presentacion;

import javax.swing.JButton;

public class PInventario extends javax.swing.JFrame {
    private final Modelo modelo;
    private Controlador2 controlador;
    
    public PInventario (Modelo aThis) {
        modelo = aThis;
        setLocationRelativeTo(null);
        componentes();
        capturarEventos();        
    }
    
    private void componentes() {
        lblImagen = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextArea();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 220, 0, 0));
        getContentPane().setLayout(null);

        
        //Imagenes
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImagen.setText("Desconectado");
        getContentPane().add(lblImagen);
        lblImagen.setBounds(280, 80, 220, 30);
        /*Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setText("Imagen");
        getContentPane().add(Imagen);
        Imagen.setBounds(120, 30, 220, 50);*/

        
        //Botones
        btnEntrar.setText("Entrar productos");
        btnEntrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });        
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(70, 70, 200, 100);


        btnSalir.setText("Sacar productos");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        /*btnAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarActionPerformed(evt);
            }
        });*/        
        getContentPane().add(btnSalir);
        btnSalir.setBounds(70, 170, 200, 100);
        
        
        //Textos de informacion
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);
        
        //Inecesario TextArea ????????????????
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 110, 250, 200);
    }

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed
    
    private void capturarEventos() {

    }
    private javax.swing.JLabel lblImagen;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JScrollPane jScrollPane1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Modelo getModelo() {
        return modelo;
    }
    
    public Controlador2 getControl() {
        if(controlador == null){
            controlador = new Controlador2(this);
        }
        return controlador;
    }
    
    public JButton getBtnEntrar() {
        return btnEntrar;
    }
    public JButton getBtnSalir() {
        return btnSalir;
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
