package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener {

	private Modelo modelo;
	
    private JPanel panelPrincipal;
    private JPanel panelMenu;
    private PanelReloj panelReloj;
    private JPanel panelAux;
    
    private JButton btnProducto;
    private JButton btnCategoria;
    private JButton btnProveedor;
    private JButton btnBodega;
    private JButton btnSalir;
    
    private JButton btnIngresarProd;
    private JButton btnRetirarProd;
    private JLabel lblUdstock;
    

	
    public VentanaPrincipal(Modelo mod, String cargo) {
        
    	modelo = mod;
    	
    	//Implementacion del panel principal
        setTitle("ParqueaSistem 0.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 970, 700);
        setResizable(false);
        //setUndecorated(true);
        panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);
        
        panelReloj = new PanelReloj();
        panelPrincipal.add(panelReloj);
        
    	panelMenu = new JPanel();
    	panelMenu.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panelMenu.setBounds(10, 10, 778, 100);
    	panelPrincipal.add(panelMenu);
    	panelMenu.setLayout(null);
    	
    	//Cargar componentes segun cargo
        System.out.println(cargo);
        if(cargo == "Admin")
        	componentesAdmin();
        else
        	componentesBodega();
        	
        panelAux();
    }
    
    //Carga del panel Auxiliar
    public void panelAux() {
    	    	
		panelAux = new JPanel();
		panelAux.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelAux.setBounds(10, 120, 936, 531);
		panelPrincipal.add(panelAux);
		panelAux.setLayout(null);
		
		//System.out.println("Borrar panelAux");	
		
		lblUdstock = new JLabel("UdStock");
		lblUdstock.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/udStock.png")));
		lblUdstock.setBounds(12, 13, 912, 505);
		panelAux.add(lblUdstock);
		
    }
    
    //Carga de componentes si ingresa un Administrador
    public void componentesAdmin(){

    	panelMenu.removeAll();
    	
    	//Botones 
		btnProducto = new JButton("");
		btnProducto.setToolTipText("Registrar Producto");
		btnProducto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnProducto.png")));
		btnProducto.setBounds(10, 10, 80, 80);
		btnProducto.addActionListener(this);
		panelMenu.add(btnProducto);
			
		btnCategoria = new JButton("");
		btnCategoria.setToolTipText("Registrar Categoria");
		btnCategoria.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnCategoria.png")));
		btnCategoria.setBounds(100, 10, 80, 80);
		btnCategoria.addActionListener(this);
		panelMenu.add(btnCategoria);
			
		btnBodega = new JButton("");
        btnBodega.setToolTipText("Registrar Bodega");
        btnBodega.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnBodega.png")));
		btnBodega.setBounds(190, 10, 80, 80);
        btnBodega.addActionListener(this);
		panelMenu.add(btnBodega);
		
		btnProveedor = new JButton("");
		btnProveedor.setToolTipText("Registrar Proveedor");
		btnProveedor.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnProveedor.png")));
	    btnProveedor.setBounds(280, 10, 80, 80);
		btnProveedor.addActionListener(this);
		panelMenu.add(btnProveedor);
			
		btnSalir = new JButton("");
		btnSalir.setToolTipText("Salir");
		btnSalir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnSalir.png")));
		btnSalir.setBounds(370, 10, 80, 80);
		btnSalir.addActionListener(this);
		panelMenu.add(btnSalir);
		
		panelMenu.revalidate();
		panelMenu.repaint();
    	
    }

    //Carga de componentes si ingresa personal de Bodega
    public void componentesBodega(){
    	  	
    	panelMenu.removeAll();
    	
		btnIngresarProd = new JButton("");
		btnIngresarProd.setToolTipText("Ingresar producto");
		btnIngresarProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnIngresarProd.png")));
		btnIngresarProd.setBounds(10, 10, 80, 80);
		btnIngresarProd.addActionListener(this);
		panelMenu.add(btnIngresarProd);
			
		btnRetirarProd = new JButton("");
		btnRetirarProd.setToolTipText("Retirar Producto");
		btnRetirarProd.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnRetirarProd.png")));
		btnRetirarProd.setBounds(100, 10, 80, 80);
		btnRetirarProd.addActionListener(this);
		panelMenu.add(btnRetirarProd);
			
		btnSalir = new JButton("");
		btnSalir.setToolTipText("Salir");
		btnSalir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/btnSalir.png")));
		btnSalir.setBounds(190, 10, 80, 80);
		btnSalir.addActionListener(this);
		panelMenu.add(btnSalir);
		
		panelMenu.revalidate();
		panelMenu.repaint();
		
    }
    
    //Llamar al panel para busqueda/edicion/ingreso de un productos
    public void panelProducto() {
    	PanelProducto panelProd = new PanelProducto();
        panelAux = panelProd;
        panelPrincipal.add(panelAux);      
    }
    
    //Llamar al panel para busqueda/edicion/ingreso de una categoria
    public void panelCategoria() {
    	PanelCategoria panelCategoria = new PanelCategoria();
        panelAux = panelCategoria;
        panelPrincipal.add(panelAux);      
    }
    
    //Llamar al panel para busqueda/edicion/ingreso de una bodega
    public void panelBodega() {
    	PanelBodega panelBodega = new PanelBodega();
        panelAux = panelBodega;
        panelPrincipal.add(panelAux);      
    }
    
    //Llamar al panel para busqueda/edicion/ingreso de un proveedor
    public void panelProveedor() {
    	PanelProveedor panelProveedor = new PanelProveedor();
        panelAux = panelProveedor;
        panelPrincipal.add(panelAux);      
    }
    
    //Llamar al panel para ingresar un producto
    public void panelIngProducto() {
    	PanelIngProducto panelIngProducto = new PanelIngProducto();
        panelAux = panelIngProducto;
        panelPrincipal.add(panelAux);      
    }
    
    //Llamar al panel para retirar un producto
    public void panelRetProducto() {
    	PanelRetProducto panelRetProducto = new PanelRetProducto();
        panelAux = panelRetProducto;
        panelPrincipal.add(panelAux);      
    }
    
    //Manejo de los eventos
	public void actionPerformed(ActionEvent event) {
		
    	//Evento boton Producto (Admin)
    	if(event.getSource() == btnProducto) {
            panelAux.removeAll();
            panelProducto();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Categoria (Admin)
    	if(event.getSource() == btnCategoria) {
            panelAux.removeAll();
            panelCategoria();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Bodega (Admin)
    	if(event.getSource() == btnBodega) {
            panelAux.removeAll();
            panelBodega();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Proveedor
    	if(event.getSource() == btnProveedor) {
            panelAux.removeAll();
            panelProveedor();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Ingresar Producto (Bodega)
    	if(event.getSource() == btnIngresarProd) {
            panelAux.removeAll();
            panelIngProducto();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Retirar Producto (Bodega)
    	if(event.getSource() == btnRetirarProd) {
            panelAux.removeAll();
            panelRetProducto();
            panelAux.revalidate();
            panelAux.repaint(); 
    	}
    	
    	//Evento boton Salir
    	if(event.getSource() == btnSalir) {
    		panelAux.removeAll();
    		this.dispose();
    		modelo.iniciar();
    	}
		
	}
}
