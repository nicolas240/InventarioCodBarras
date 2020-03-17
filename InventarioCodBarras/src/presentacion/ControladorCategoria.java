package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorCategoria implements ActionListener{
	
	private final PanelCategoria venCategoria;
	private LoginDAO login;
	
	public ControladorCategoria(PanelCategoria vCategoria) {
		venCategoria = vCategoria;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
        		//Evento boton Buscar Bodega
    	if(event.getSource() == venCategoria.getBtnBuscarBodega()) {
    		//Se activa la aparecion del boton de eliminar si se encuentra la bodega
    	}
    	
    	//Evento boton Guardar
    	if(event.getSource() == venCategoria.getBtnGuardar()) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() ==venCategoria.getBtnEliminar()) {

    	}	
    }	
}