import Presentacion.Modelo;

public class launcher {

    private Modelo miApp;

    public launcher() {
        miApp = new Modelo();
        miApp.iniciar();
    }
    
    
    public static void main(String[] args) {
        new launcher();
    }
    
}


