package Presentacion;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class LogIn extends javax.swing.JFrame {
    private final Modelo modelo;
    private Controlador4 controlador;
    
    public LogIn(Modelo aThis) {
        modelo = aThis;
        setLocationRelativeTo(null);
        componentes();
        capturarEventos();        
    }
    
    private void componentes() {
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 220, 0, 0));
        getContentPane().setLayout(null);
        
        //Textos planos
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 10, 170, 30);

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Contraseña");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(70, 40, 170, 30);
        
        //Texto
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(250, 10, 180, 20);       

        txtPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(250, 40, 180, 20);
        
        //Botones
        
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });        
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(130, 70, 200, 50);
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code he
    }
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code he
    }                                        
    private void btnAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed
    
    private void capturarEventos(){
        btnIngresar.addActionListener(getControl());
    }
    
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtPassword;    
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
    
    public Controlador4 getControl() {
        if(controlador == null){
            controlador = new Controlador4(this);
        }
        return controlador;
    }
    
    public JButton getBtnIngresar() {
        return btnIngresar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
