package state.connection;

public class Stopped extends State {

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

    @Override
    public void parar(Conexion conexion) {
    }

    @Override
    public void iniciar(Conexion conexion) {
        conexion.setState(new Ready());
    }

}
