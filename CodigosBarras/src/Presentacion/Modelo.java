package Presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Modelo {
    private PInicial inicio;
    private PInventario inventario;
    private PAdministrar administrador;
    
    private LogIn login;
    
    private PBuscar busqueda;
    private PEditar editor;
    
    public int width, heigt;
    
    public Modelo(){
        calPantalla();
    };
    
    public void iniciar() {
        getVentanaInicio().setSize(width/3, heigt/3);
        getVentanaInicio().setVisible(true);
    }
    
    public void Inventarios() {
        getVentanaInicio().setVisible(false);
        getVentanaInventario().setSize(width/2, heigt/2);
        getVentanaInventario().setVisible(true);
    }
    
    public void Administracion() {
        getVentanaLogin().setVisible(false);
        getVentanaInicio().setVisible(false);
        getVentanaAdministrar().setSize(width/2, heigt/2);
        getVentanaAdministrar().setVisible(true);
    }   

    public void Login() {
        getVentanaLogin().setSize(width/3, heigt/4);
        getVentanaLogin().setVisible(true);
    }

    void Buscar() {
        getVentanaAdministrar().setVisible(false);
        getVentanaBuscar().setSize(width/2, heigt/2);
        getVentanaBuscar().setVisible(true);
    }

    void Editar() {
        getVentanaAdministrar().setVisible(false);
        getVentanaEditor().setSize(width/2, heigt/2);
        getVentanaEditor().setVisible(true);
    }
    
    private void calPantalla() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width= screenSize.width;
        heigt=screenSize.height;
    }
    
    public PInicial getVentanaInicio() {
        if(inicio == null){
            inicio = new PInicial(this);
        }
        return inicio;
    }
    public PInventario getVentanaInventario() {
        if(inventario == null){
            inventario = new PInventario(this);
        }
        return inventario;
    }
    public PAdministrar getVentanaAdministrar() {
        if(administrador == null){
            administrador = new PAdministrar(this);
        }
        return administrador;
    }    
    public LogIn getVentanaLogin() {
        if(login == null){
            login = new LogIn(this);
        }
        return login;
    }
    public PBuscar getVentanaBuscar() {
        if(busqueda == null){
            busqueda = new PBuscar(this);
        }
        return busqueda;
    }
    public PEditar getVentanaEditor() {
        if(editor == null){
            editor= new PEditar(this);
        }
        return editor;
    }    
}