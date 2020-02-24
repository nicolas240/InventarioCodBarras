package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Controlador de la pantalla de inventario, entrada y salida de productos 
class Controlador2 implements ActionListener{
    
    private final PInventario ventana;
    public Controlador2(PInventario aThis) {
        ventana = aThis;
    }
    
    private void mostrarError(String msg) {
        JOptionPane.showMessageDialog(ventana, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton;
        /*if(e.getSource()==ventana.getBtnInventario())
            ventana.getModelo().Inventarios();
        else
            ventana.getModelo().Administracion();*/
    }
}
