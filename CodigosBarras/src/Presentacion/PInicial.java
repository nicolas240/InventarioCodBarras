package Presentacion;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PInicial extends javax.swing.JFrame {
    private final Modelo modelo;
    private Controlador1 controlador;
    
    public PInicial(Modelo aThis) {
        modelo = aThis;
        setLocationRelativeTo(null);
        componentes();
        capturarEventos();        
    }
    
    private void componentes() {
        lblTitulo = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();
        btnInventario = new javax.swing.JButton();
        btnAdministrar = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 220, 0, 0));
        getContentPane().setLayout(null);
        
        //Textos planos
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Bodegas s.a");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(120, 10, 220, 30);

        //Botones
        
        btnInventario.setText("Hacer inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });        
        getContentPane().add(btnInventario);
        btnInventario.setBounds(130, 70, 200, 50);

        btnAdministrar.setText("Entrar como administrador");
        btnAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrar);
        btnAdministrar.setBounds(130, 135, 200, 50);

    }
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed
    private void btnAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed
    
    private void capturarEventos(){
        btnInventario.addActionListener(getControl());
        btnAdministrar.addActionListener(getControl());
    }
    
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnAdministrar;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPuerto;    
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
    
    public Controlador1 getControl() {
        if(controlador == null){
            controlador = new Controlador1(this);
        }
        return controlador;
    }
    
    public JButton getBtnInventario() {
        return btnInventario;
    }
    public JButton getBtnAdministrador() {
        return btnAdministrar;
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
