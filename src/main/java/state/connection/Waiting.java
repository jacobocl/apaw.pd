package state.connection;

public class Waiting extends State {

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
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
        if (respuesta == 0) {
            conexion.setState(new Ready());
        } else {
            conexion.setState(new Closed());
        }
    }

}
