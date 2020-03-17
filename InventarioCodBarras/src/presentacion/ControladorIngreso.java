package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
    		//Aqui se llama la consulta pare verificar que el admin existe en la base de datos 
    		System.out.println("SELECT * FROM Cuenta WHERE pass='"+venIngreso.getPwdPassword().getText() 
					+"' AND usuario='"+venIngreso.getTxtUsuario().getText()+"';");
    		
    		login = new LoginDAO(venIngreso);
			
    		if(login.loginAdmin()) {
	    		venIngreso.dispose();	//Cierra la ventana actual
	    		venIngreso.getModelo().admin();
    		}else {
    			JOptionPane.showMessageDialog(null, "Usuario O Password incorrecto");
    		}
    	}
    	
    	//Evento boton Login Bodega
    	if(event.getSource() == venIngreso.getBtnLoginBod()) {
    		//Aqui se llama la consulta pare verificar que el documento del usiario de bodega existe en la base de datos  
    		
    		venIngreso.dispose();	//Cierra la ventana actual
    		venIngreso.getModelo().bodega();
    		
    	}
    	
    	//Evento boton Atras
    	if(event.getSource() == venIngreso.getBtnAtras()) {
    		venIngreso.panelBotonesSeleccion();
            
    	}
		
	}
}