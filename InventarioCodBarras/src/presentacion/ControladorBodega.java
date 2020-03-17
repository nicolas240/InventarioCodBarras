package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorBodega implements ActionListener{
	
	private final PanelBodega venBodega;
	private LoginDAO login;
	
	public ControladorBodega(PanelBodega vBodega) {
		venBodega = vBodega;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
        		//Evento boton Buscar Bodega
    	if(event.getSource() == venBodega.getBtnBuscarBodega()) {
    		//Se activa la aparecion del boton de eliminar si se encuentra la bodega
    	}
    	
    	//Evento boton Guardar
    	if(event.getSource() == venBodega.getBtnGuardar()) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() ==venBodega.getBtnEliminar()) {

    	}	
    }	
}