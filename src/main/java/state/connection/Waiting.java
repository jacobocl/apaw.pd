package state.connection;

public class Waiting extends State {

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        if (respuesta == 0) {
            conexion.setState(new Ready());
        } else {
            conexion.setState(new Closed());
        }
    }

}
