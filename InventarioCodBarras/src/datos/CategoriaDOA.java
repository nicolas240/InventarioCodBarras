package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.PanelCategoria;
import presentacion.PanelProducto;

public class CategoriaDOA {
	
	private ConexionDB db;
	private PanelCategoria panelCategoria;
	
	Statement stmt = null;
	
	//Variables que se les asigna la informacion
	private int id;
	private String nombre;
	private String descripcion;
	

	
	public CategoriaDOA(PanelCategoria pCategoria){
		pCategoria = panelCategoria;
		
	}
	
	//Registrar una nueva categoria
	public boolean registrarCategoria(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//--Categoria categoria(id I, nomb T, descr T)
                        //Eje--INSERT INTO Categoria VALUES (1,'detergente','Varios tipos de detergentes');
			
			ResultSet rs = stmt.executeQuery( "INSERT INTO Categoria VALUES ("+ id + ",'"
											+ nombre + "','"+ descripcion + "');" );
			
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
	public boolean buscarCategoria(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//Categoria categoria(id I, nomb T, descr T))
			//Eje--SELECT * FROM Categoria WHERE id=1; 
			
			ResultSet rs = stmt.executeQuery( 
                                "SELECT * FROM Categoria WHERE id='" + 
                                        panelCategoria.getTxtIngreseId().toString()
                                        + "';" );
			
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
	public boolean modificarCategoria(int id, String nomb, String desc){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//categoria(id I, nomb T, descr T)
			//Eje--UPDATE Categoria SET id = 2, nombre = 'dw' WHERE id=1;
			ResultSet rs;
                        if (!nomb.isEmpty())
                        {   
                            if(!desc.isEmpty()){
                                rs= stmt.executeQuery( "UPDATE Categoria SET nombre='"
                                        + nomb + "',descripcion='" + desc + "' WHERE id="+id+" ;" );
                                rs.close();
                                stmt.close();
                                db.getC().close();
                            }else{
                                rs= stmt.executeQuery( "UPDATE Categoria SET nombre='"
                                        + nomb + "' WHERE id="+id+" ;" );
                                rs.close();
                                stmt.close();
                                db.getC().close();
                            }
                        }else{
                            rs= stmt.executeQuery( "UPDATE Categoria SET descripcion='"
                                    + desc + "' WHERE id="+id+" ;" );
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
