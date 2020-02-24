package Presentacion;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PBuscar extends javax.swing.JFrame {
    private final Modelo modelo;
    private Controlador6 controlador;
    
    public PBuscar (Modelo aThis) {
        modelo = aThis;
        setLocationRelativeTo(null);
        componentes();
        capturarEventos();        
    }

    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private JTable tblBodegas;
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

    private void componentes() {
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        
        //Añadir modelos de tabla, se puede manejar de forma abstracta para crear todas las tablas
        //http://www.chuidiang.org/java/tablas/tablamodelo/tablamodelo.php
        DefaultTableModel defecto = new DefaultTableModel();
        tblBodegas = new JTable (defecto);
        jScrollPane1 = new javax.swing.JScrollPane();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 220, 0, 0));
        getContentPane().setLayout(null);

        //Botones
        
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setText("Filtrar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });        
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(130, 10, 200, 35);
          
        //Tablas
        jScrollPane1.setViewportView(tblBodegas);
                
        //Inecesario TextArea ????????????????
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 600, 460);
    }

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code here:
    }                                            
    
    private void capturarEventos() {
        
    }



    public Modelo getModelo() {
        return modelo;
    }
    
    public Controlador6 getControl() {
        if(controlador == null){
            controlador = new Controlador6(this);
        }
        return controlador;
    }
    
    public JButton getBtnBuscar() {
        return btnBuscar;
    }
    public JButton getBtnEditaror() {
        return btnEditar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
