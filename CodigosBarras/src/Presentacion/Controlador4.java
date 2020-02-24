package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Controlador para verificar el login de la Administracion
class Controlador4 implements ActionListener{
    
    private final LogIn ventana;
    public Controlador4(LogIn aThis) {
        ventana = aThis;
    }
    
    private void mostrarError(String msg) {
        JOptionPane.showMessageDialog(ventana, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Se valida el usuario y contraseña llamando ventana y modelo, para mirar en la base de datos
        if(e.getSource()==ventana.getBtnIngresar())
            ventana.getModelo().Administracion();
    }
}
