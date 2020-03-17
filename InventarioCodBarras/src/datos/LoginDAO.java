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
	
	//Login de Administrador
	public boolean loginAdmin(){
		
		boolean existe = false;
			
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			//Consulta que verifica si existe una cuenta con los datos ingresados
			ResultSet rs = stmt.executeQuery( "SELECT count(*) FROM Cuenta WHERE pass='"+ String.valueOf(venIngreso.getPwdPassword().getPassword()) 
					+"' AND usuario='"+venIngreso.getTxtUsuario().getText()+"';" );

			//Si la cuenta existe arroja verdadero, de lo contrario sera falso
			if(rs.getInt("count(*)") == 1)
				existe = true;
			else
				existe = false;
			
			rs.close();
			stmt.close();
			db.getC().close();
			System.out.println("Consulta Satisfactoria");
			
		}catch ( Exception e ) {
		   System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		   JOptionPane.showMessageDialog(null, "Base de datos no disponible en el momento");
	   	}
		return existe;
		
	}
	
	//Login de Administrador
		public boolean loginBodega(){
			
			boolean existe = false;
				
			try {
				db = new ConexionDB();
				
				stmt = db.getC().createStatement();
				//Consulta que verifica si existe una cuenta con los datos ingresados
				///SELECT id from Trabajador where id = 1000000003;
				ResultSet rs = stmt.executeQuery( "SELECT count(id) FROM Trabajador WHERE id='"+venIngreso.getTxtDocumento().getText()+"';" );
				
				//Si la cuenta existe arroja verdadero, de lo contrario sera falso
				if(rs.getInt("count(id)") == 1)
					existe = true;
				else
					existe = false;
				
				rs.close();
				stmt.close();
				db.getC().close();
				System.out.println("Consulta Satisfactoria");
				
			}catch ( Exception e ) {
			   System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			   JOptionPane.showMessageDialog(null, "Base de datos no disponible en el momento");
		   	}
			return existe;
			
		}

}
