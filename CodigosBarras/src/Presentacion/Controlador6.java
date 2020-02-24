package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//Controlador para filtrar y buscar
class Controlador6 implements ActionListener{
    
    private final PBuscar ventana;
    public Controlador6(PBuscar aThis) {
        ventana = aThis;
    }
    
    private void mostrarError(String msg) {
        JOptionPane.showMessageDialog(ventana, msg, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Se valida el usuario y contraseña llamando ventana y modelo, para mirar en la base de datos
        /*if(e.getSource()==ventana.getBtnIngresar())
            ventana.getModelo().Administracion();*/
    }
}
