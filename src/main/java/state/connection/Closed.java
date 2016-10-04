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

}
