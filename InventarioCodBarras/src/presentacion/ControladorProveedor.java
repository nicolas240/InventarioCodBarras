package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorProveedor implements ActionListener{
	
	private final PanelProveedor venProveedor;
	private LoginDAO login;
	
	public ControladorProveedor(PanelProveedor vProveedor) {
		venProveedor = vProveedor;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
       	//Evento boton Buscar Bodega
    	if(event.getSource() == venProveedor.getBtnBuscarProveedor()) {
    		//Se activa la aparecion del boton de eliminar si se encuentra la bodega
    	}
    	
    	//Evento boton Guardar
    	if(event.getSource() ==venProveedor.getBtnGuardar() ) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() == venProveedor.getBtnEliminar()) {

    	}	
    }	
}