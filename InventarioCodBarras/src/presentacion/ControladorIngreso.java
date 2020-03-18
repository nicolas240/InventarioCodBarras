package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import datos.*;

public class ControladorIngreso implements ActionListener{
	
	private final VentanaIngreso venIngreso;
	private LoginDAO login;
	
	public ControladorIngreso(VentanaIngreso vIngreso) {
		venIngreso = vIngreso;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
		
     	//Evento boton Administrador (Cargar login para administrador)
    	if(event.getSource() == venIngreso.getBtnAdministrador()){
    		venIngreso.panelLoginAdmin();
    	}
    	
    	//Evento boton Bodega (Cargar login para bodegueros)
    	if(event.getSource() == venIngreso.getBtnBodega()){
    		venIngreso.panelLoginBodega();     
    	}
    	
    	//Evento boton Login Admin
    	if(event.getSource() == venIngreso.getBtnLoginAdm()) {
    		//Llamado a la consulta de la BD
    		login = new LoginDAO(venIngreso);
			
    		if(login.loginAdmin()) {
	    		venIngreso.getModelo().getVenIngreso().dispose();	//Cierra la ventana actual
	    		venIngreso.getModelo().admin();
    		}else {
    			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
    		}
    		
    		venIngreso.getModelo().setUsuario( Integer.parseInt( venIngreso.getTxtUsuario().getText() ) );
    	}
    	
    	//Evento boton Login Bodega
    	if(event.getSource() == venIngreso.getBtnLoginBod()) {
    		//Llamado a la consulta de la BD 
    		login = new LoginDAO(venIngreso);
			
    		if(login.loginBodega()){
    			venIngreso.getModelo().getVenIngreso().dispose();	//Cierra la ventana actual
        		venIngreso.getModelo().bodega();
    		}else {
    			JOptionPane.showMessageDialog(null, "Documento incorrecto");
    		}
    		
    		venIngreso.getModelo().setUsuario( Integer.parseInt( venIngreso.getTxtDocumento().getText() ) );
    	}
    	
    	//Evento boton Atras
    	if(event.getSource() == venIngreso.getBtnAtras()) {
    		venIngreso.panelBotonesSeleccion();
            
    	}
		
	}
}