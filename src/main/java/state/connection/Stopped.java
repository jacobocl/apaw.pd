package state.connection;

public class Stopped extends State {

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

    @Override
    public void abrir(Conexion conexion) {
        noPermitido();
    }

    @Override
    public void cerrar(Conexion conexion) {
        noPermitido();
    }

    @Override
    public void parar(Conexion conexion) {
    }

    @Override
    public void iniciar(Conexion conexion) {
        conexion.setState(new Ready());
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
