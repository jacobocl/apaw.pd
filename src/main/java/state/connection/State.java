package state.connection;

public abstract class State {
    
    public abstract Estado getEstado();
    
    public void abrir(Conexion conexion){
        noPermitido();
    }
    
    public void cerrar(Conexion conexion){
        noPermitido();
    }
    
    public void parar(Conexion conexion){
        noPermitido();
    }
    
    public void iniciar(Conexion conexion){
        noPermitido();
    }
    
    public void enviar(Conexion conexion, String msg){
        noPermitido();
    }
    
    public void recibir(Conexion conexion, int respuesta){
        noPermitido();
    }
    
    private void noPermitido() {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }
}
