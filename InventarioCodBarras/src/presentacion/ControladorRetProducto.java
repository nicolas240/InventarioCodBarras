package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import datos.*;

public class ControladorRetProducto implements ActionListener{
	
	private final PanelRetProducto venRetProducto;
	private LoginDAO login;
	
	public ControladorRetProducto(PanelRetProducto vRetProducto) {
		venRetProducto = vRetProducto;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
        //Evento boton Retirar
    	if(event.getSource() == venRetProducto.getBtnRetirar()) {

    	}
    	
    	//Evento boton Verificar
    	if(event.getSource() == venRetProducto.getBtnVerificar()) {

    	}	
    }	
}