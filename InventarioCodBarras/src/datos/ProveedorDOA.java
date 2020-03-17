package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.PanelProveedor;

public class ProveedorDOA {
	
	private ConexionDB db;
	private PanelProveedor panelProveedor;
	
	Statement stmt = null;
	
	//Variables que se les asigna la informacion
	private String nombre;
	private int rut;
	private int telefono;
	

	
	public ProveedorDOA(PanelProveedor pProveedor){
		pProveedor = panelProveedor;
		
	}
	
	//Registrar una nueva categoria
	public boolean registrarProveedor(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//--Proveedor  proveedor(nomb T, rut  I, telefono I)
                        //Eje--INSERT INTO Proveedor VALUES ('estes',1000000001,12141523);
			
			ResultSet rs = stmt.executeQuery( "INSERT INTO Proveeodr VALUES ('"
                                + nombre + "',"+ rut + ","+ telefono + ");" );
			
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
			
			//Categoria Proveedor(nombre T, rut I, telefono I))
			//Eje--SELECT * FROM Proveedor WHERE rut=10000000001; 
			
			ResultSet rs = stmt.executeQuery( 
                                "SELECT * FROM Categoria WHERE rut=" + 
                                        panelProveedor.getTxtRut()
                                        + ";" );
			
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
	
	//modificar producto
	public boolean modificarProveedor(String nomb, int rut, int tel){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//Proveedor(nomb T, rut I, tel I)
			//Eje--UPDATE Proveedor SET rut = 2122312541515, nombre = 'dw' WHERE id=1;
			ResultSet rs;
                        if (!nomb.isEmpty())
                        {   
                            if( tel !=0){
                                rs= stmt.executeQuery( "UPDATE Proveedor SET nombre='"
                                        + nomb + ",telefono=" + tel + "' WHERE rut="+rut+" ;" );
                                rs.close();
                                stmt.close();
                                db.getC().close();
                            }else{
                                rs= stmt.executeQuery( "UPDATE Proveedor SET nombre='"
                                        + nomb + "' WHERE rut="+rut+";" );
                                rs.close();
                                stmt.close();
                                db.getC().close();
                            }
                        }else{
                            rs= stmt.executeQuery( "UPDATE Proveedor SET telefono='"
                                    + tel + "' WHERE rut="+rut+";" );
                            rs.close();
                            stmt.close();
                            db.getC().close(); 
                        }
			
			System.out.println("Consulta Satisfactoria");
			
		}catch ( Exception e ) {
		   System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		   JOptionPane.showMessageDialog(null, "Base de datos no disponible en el momento");
	   	}
		return existe;	
        }
}