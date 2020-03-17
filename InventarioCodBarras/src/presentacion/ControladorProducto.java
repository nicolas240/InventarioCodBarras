package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorProducto implements ActionListener{
	
	private final PanelProducto venProducto;
	private LoginDAO login;
	
	public ControladorProducto(PanelProducto vProducto) {
		venProducto = vProducto;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
        	//Evento boton Buscar Producto
    	if(event.getSource() ==venProducto.getBtnBuscarProducto()) {
    		//Se activa la aparecion del boton de eliminar si se encuentra el producto
    	}
    	
    	//Evento boton Guardar
    	if(event.getSource() == venProducto.getBtnGuardar()) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() == venProducto.getBtnEliminar()) {

    	}
    }	
}