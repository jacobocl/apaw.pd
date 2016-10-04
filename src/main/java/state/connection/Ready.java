package state.connection;

public class Ready extends State {

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

    @Override
    public void abrir(Conexion conexion) {
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new Closed());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Stopped());
    }

    @Override
    public void iniciar(Conexion conexion) {
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setState(new Waiting());
    }

}
