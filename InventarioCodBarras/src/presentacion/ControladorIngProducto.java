package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorIngProducto implements ActionListener{
	
	private final PanelIngProducto venIngProducto;
	private LoginDAO login;
	
	public ControladorIngProducto(PanelIngProducto vIngProducto) {
		venIngProducto = vIngProducto;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
            	//Evento boton Guardar
    	if(event.getSource() == venIngProducto.getBtnIngresar()) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() == venIngProducto.getBtnVerificar()) {

    	}	
    }	
}