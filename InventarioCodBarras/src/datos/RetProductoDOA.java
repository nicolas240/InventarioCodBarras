package datos;

import java.sql.*;

import javax.swing.JOptionPane;

import presentacion.PanelIngProducto;

public class RetProductoDOA {
	
	private ConexionDB db;
	private PanelIngProducto panelIngProducto;
	
	Statement stmt = null;
	
	//Variables que se les asigna la informacion
	private String codBarras;	
	private String idBodega;
        private int cantidad;
        
	public RetProductoDOA(PanelIngProducto pIngProducto){
		panelIngProducto=pIngProducto;
		
	}
	
	//Registrar una nueva bodega
	public boolean ingresarProducto(){
		
		boolean existe = false;
	
		try {
			db = new ConexionDB();
			
			stmt = db.getC().createStatement();
			
			//--ExtProd(idP T, idB T, can I )
                        //Eje--INSERT INTO ExistenciaProductoBodega VALUES ('BOD01','AS23',++);
			cantidad++;
			ResultSet rs = stmt.executeQuery( "INSERT INTO ExistenciaProductoBodega VALUES ('"
                                + codBarras + "','"+ idBodega + "',"+ cantidad + ");" );			
			rs = stmt.executeQuery( "UPDATE ExistenciaProductoBodega SET cantidad="+
                                cantidad+" WHERE codigoBarras='"+codBarras+"';");
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