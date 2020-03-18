package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.PanelBodega;

public class BodegaDOA {
	
	private ConexionDB db;
	private PanelBodega panelBodega;
	
	Statement stmt = null;
	
	//Variables que se les asigna la informacion
	private String idBodega;
	private int idAdministrador;
	private int capacidad;	
	
	public BodegaDOA(PanelBodega pBodega){
		panelBodega=pBodega;
		
	}
	
	//Registrar una nueva bodega
	public boolean registrarBodega(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//--Bodega bodega(idB T, idAd I, capc I)
                        //Eje--INSERT INTO Bodega VALUES ('BOD01',1000000001,400);
			
			ResultSet rs = stmt.executeQuery( "INSERT INTO Bodega VALUES ('"
                                + idBodega + "',"+ idAdministrador + ","+ capacidad + ");" );			
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
	
	//Buscar un producto
	public boolean buscarProveedor(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//Bodega bodega(idB T, idAd I, capc I)
			//Eje--SELECT * FROM Bodega WHERE idBodega='BOD23'; 
			
			ResultSet rs = stmt.executeQuery( 
                                "SELECT * FROM Bodega WHERE idBodega='" + 
                                        //panelBodega.getTxtAdmin()
                                        "';" );
			
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
	
	//modificar Bodega
	public boolean modificarBodega(String idB, int idAd){
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//bodega(idB T, idAd I, capc I)
			//Eje--UPDATE Proveedor SET rut = 2122312541515, nombre = 'dw' WHERE id=1;
			ResultSet rs;
                        rs= stmt.executeQuery( "UPDATE Bodega SET idAdministrador="
                                + idAd + " WHERE idBodega='"+idB+"' ;" );
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
	public boolean modificarBodega(int cap,String idB){
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//bodega(idB T, idAd I, capc I)
			//Eje--UPDATE Proveedor SET rut = 2122312541515, nombre = 'dw' WHERE id=1;
			ResultSet rs;
                        rs= stmt.executeQuery( "UPDATE Proveedor SET capacidad="
                                + cap + " WHERE idBodega='"+idB+"' ;" );
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
	public boolean modificarBodega(String idB, int idAd, int cap){
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//bodega(idB T, idAd I, capc I)
			//Eje--UPDATE Proveedor SET rut = 2122312541515, nombre = 'dw' WHERE id=1;
			ResultSet rs;
                        rs= stmt.executeQuery( "UPDATE Bodega SET idAdministrador="
                                + idAd +",capacidad="+cap +" WHERE idBodega="+idB+";" );
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