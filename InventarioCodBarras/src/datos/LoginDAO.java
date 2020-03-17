package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.VentanaIngreso;

public class LoginDAO {
	
	private ConexionDB db;
	private VentanaIngreso venIngreso;
	
	Statement stmt = null;
	
	public LoginDAO(VentanaIngreso vIngreso){
		venIngreso = vIngreso;
	}
	
	public boolean loginAdmin(){
		
		boolean existe = false;
			
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM Cuenta WHERE pass='"+venIngreso.getPwdPassword().getText() 
											+"' AND usuario='"+venIngreso.getTxtUsuario().getText()+"';" );
			
			System.out.println("Usuario: " + rs.getInt("usuario"));
			System.out.println("Pass: " + rs.getString("pass"));

			if(!rs.next())
				existe = false;
			else
				existe = true;
			
			rs.close();
			stmt.close();
			db.getC().close();
			System.out.println("Consulta Satisfactoria");
			
		}catch ( Exception e ) {
		   System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		   //JOptionPane.showMessageDialog(null, "Base De Datos no disponible en el momento");
	   	}
		return existe;
		
	}

}
