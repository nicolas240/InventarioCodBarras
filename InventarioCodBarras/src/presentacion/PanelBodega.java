package presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelBodega extends JPanel implements ActionListener{

    private JLabel lblBodega;
    private JLabel lblBusBodega;
    private JTextField txtBusBodega;
    
    private JButton btnBuscarBodega;
    private JSeparator separador;
    private JLabel lblNoBodega;
    private JTextField txtNoBodega;
    private JLabel lblCapacidad;
    private JTextField txtCapacidad;
    private JLabel lblAdmin;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JLabel lblInfo;
    private JTextField txtAdmin;
    private JTextField textField;
	
	public PanelBodega() {
		
        this.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(10, 120, 936, 531);
        this.setLayout(null);

		lblBodega = new JLabel("BODEGA");
		lblBodega.setForeground(new Color(61, 139, 158));
		lblBodega.setHorizontalAlignment(SwingConstants.CENTER);
		lblBodega.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBodega.setBounds(211, 13, 150, 20);
		this.add(lblBodega);
		
		lblBusBodega = new JLabel("No. Bodega:");
		lblBusBodega.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBusBodega.setBounds(133, 74, 100, 25);
		this.add(lblBusBodega);
		
		txtBusBodega = new JTextField();
		txtBusBodega.setBounds(245, 75, 116, 25);
		this.add(txtBusBodega);
		txtBusBodega.setColumns(10);
		
		btnBuscarBodega = new JButton("Buscar Bodega");
		btnBuscarBodega.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscarBodega.setBounds(373, 74, 160, 25);
		btnBuscarBodega.addActionListener(this);
		this.add(btnBuscarBodega);
		
		separador = new JSeparator();
		separador.setBounds(12, 141, 624, 2);
		this.add(separador);
		
		lblNoBodega = new JLabel("No. de Bodega:");
		lblNoBodega.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNoBodega.setBounds(160, 172, 130, 25);
		this.add(lblNoBodega);
		
		txtNoBodega = new JTextField();
		txtNoBodega.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNoBodega.setBounds(302, 172, 150, 25);
		this.add(txtNoBodega);
		txtNoBodega.setColumns(10);
		
		lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapacidad.setBounds(160, 209, 135, 25);
		this.add(lblCapacidad);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCapacidad.setBounds(302, 210, 150, 25);
		this.add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		lblAdmin = new JLabel("Administrador:");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdmin.setBounds(160, 247, 140, 25);
		this.add(lblAdmin);
		
		new ButtonGroup();
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(245, 469, 97, 25);
		btnGuardar.addActionListener(this);
		this.add(btnGuardar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(354, 470, 97, 25);
		btnEliminar.addActionListener(this);
		this.add(btnEliminar);
		
		
		lblInfo = new JLabel("Info");
		lblInfo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/infoBodega.png")));
		lblInfo.setBounds(648, 13, 276, 505);
		this.add(lblInfo);
		
		txtAdmin = new JTextField();
		txtAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAdmin.setColumns(10);
		txtAdmin.setBounds(302, 248, 150, 25);
		add(txtAdmin);
		
		JLabel lblBodeguero = new JLabel("Bodeguero:");
		lblBodeguero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBodeguero.setBounds(160, 285, 140, 25);
		add(lblBodeguero);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(302, 286, 150, 25);
		add(textField);
	}

	
	//Manejo de los eventos
	public void actionPerformed(ActionEvent event) {
		
		//Evento boton Buscar Bodega
    	if(event.getSource() == btnBuscarBodega) {
    		//Se activa la aparecion del boton de eliminar si se encuentra la bodega
    	}
    	
    	//Evento boton Guardar
    	if(event.getSource() == btnGuardar) {

    	}
    	
    	//Evento boton Eliminar
    	if(event.getSource() == btnEliminar) {

    	}
		
	}
}