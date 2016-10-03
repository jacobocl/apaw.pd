package state.connection;

public class Closed extends State {

    @Override
    public Estado getEstado() {
        return Estado.CERRADO;
    }

    @Override
    public void abrir(Conexion conexion) {
        conexion.setState(new Ready());
    }

    @Override
    public void cerrar(Conexion conexion) {
    }

    @Override
    public void parar(Conexion conexion) {
        noPermitido();
    }

    @Override
    public void iniciar(Conexion conexion) {
        noPermitido();
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        noPermitido();
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        noPermitido();
    }

}
