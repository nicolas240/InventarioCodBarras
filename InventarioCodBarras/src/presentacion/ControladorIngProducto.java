package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import datos.*;

public class ControladorIngProducto implements ActionListener{
	
	private final PanelIngProducto panIngProducto;
	private IngProductoDAO ingProducto;
	
	public ControladorIngProducto(PanelIngProducto pIngProducto) {
		panIngProducto = pIngProducto;
	}

	//Manejo de los eventos que vienen de la ventana
	public void actionPerformed(ActionEvent event) {
		
		ingProducto = new IngProductoDAO(panIngProducto);
		
         //Evento boton Verificar
    	if(event.getSource() == panIngProducto.getBtnVerificar()) {
    		
    		//Mostrar datos en el panel
    		if(ingProducto.buscarProducto()){
    			
    			panIngProducto.getTxtNombre().setText(ingProducto.getNombre());
    			panIngProducto.getTxtFechaingreso().setText(ingProducto.getFecha());
    			panIngProducto.getTxtCodigobarras().setText(ingProducto.getCodBarras());
    			System.out.println("Perecedero:" + ingProducto.getPerecedero());
    			if(ingProducto.getPerecedero()==1)
    				panIngProducto.getRdbPerecederoSi().setSelected(true);
    			else
    				panIngProducto.getRdbPerecederoNo().setSelected(true);
    			panIngProducto.getTxtCategoria().setText( String.valueOf(ingProducto.getCategoria() ));
    			panIngProducto.getTxtProveedor().setText( String.valueOf(ingProducto.getProveedor() ));
    			panIngProducto.getTxtCantidad().setText( String.valueOf(ingProducto.getCantidad() ));
    		}else {
    			JOptionPane.showMessageDialog(null, "Producto no existe");
    		}		

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() == panIngProducto.getBtnIngresar()) {
    		
    		//Mostrar datos en el panel
    		if(ingProducto.buscarProducto()){
    			if(ingProducto.ingresarProducto())
    				JOptionPane.showMessageDialog(null, "Producto ingresado");	
    		}else {
    			JOptionPane.showMessageDialog(null, "Producto no existe");
    		}	

    	}
    }	
}