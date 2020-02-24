package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Controlador de la pantalla Administrar, controlar bodegas y productos
class Controlador3 implements ActionListener{
    
    private final PAdministrar ventana;
    public Controlador3(PAdministrar aThis) {
        ventana = aThis;
    }
    
    private void mostrarError(String msg) {
        JOptionPane.showMessageDialog(ventana, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ventana.getBtnBuscar())
            ventana.getModelo().Buscar();
        else
            ventana.getModelo().Editar();
    }
}
