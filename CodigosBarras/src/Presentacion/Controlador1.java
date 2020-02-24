package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Controlador de la pantalla inicial, eleccion de botones investigar y administar
class Controlador1 implements ActionListener{
    
    private final PInicial ventana;
    public Controlador1(PInicial aThis) {
        ventana = aThis;
    }
    
    private void mostrarError(String msg) {
        JOptionPane.showMessageDialog(ventana, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ventana.getBtnInventario())
            ventana.getModelo().Inventarios();
        else
            ventana.getModelo().Login();
    }
}
