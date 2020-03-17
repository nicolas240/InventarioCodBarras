package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.PanelProducto;

public class ProductoDOA {
	
	private ConexionDB db;
	private PanelProducto panelProducto;
	
	Statement stmt = null;
	
	//Variables que se les asigna la informacion
	private String nombre;
	private String fecha;
	private String codBarras;
	private int perecedero;
	private int categoria;
	private int proveedor;
	
	public ProductoDOA(PanelProducto pProducto){
		pProducto = panelProducto;
		
	}
	
	//Registrar un nuevo producto
	public boolean registrarProducto(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//producto(nomb T, fIng T, codB T, perec I, idC I, idP I)
			//Eje--INSERT INTO Producto VALUES ('ariel ropa color','14-03-2020','ARI01',1,1,200000002);
			
			ResultSet rs = stmt.executeQuery( "INSERT INTO PProducto VALUES ('"+ nombre + ", "
											+ fecha + ", "+ codBarras + ", "+ perecedero + ", " + categoria + ", "
											+ proveedor + "');" );
			
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
	public boolean buscarProducto(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//producto(nomb T, fIng T, codB T, perec I, idC I, idP I)
			//Eje--SELECT * FROM Producto WHERE codBarras='ARI01'; 
			
			ResultSet rs = stmt.executeQuery( "SELECT * FROM Producto WHERE codBarras='" + codBarras + "';" );
			
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
	public boolean modificarProducto(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//producto(nomb T, fIng T, codB T, perec I, idC I, idP I)
			//Eje--UPDATE table_name SET column1 = value1, column2 = value2	WHERE condition;
			
			ResultSet rs = stmt.executeQuery( "UPDATE Producto SET nombre='" + nombre + "', fIngreso='" + fecha 
											+ "', codBarras='" + codBarras + "', perecedero='" + perecedero
											+ "', idCategoria='" + categoria + "', idProveedor='" + proveedor + "';" );
			
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
