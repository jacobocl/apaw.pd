package state.connection;

public class Conexion {
    private Link link;
    
    private State state;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        state = new Closed();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return state.getEstado();
    }

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }

    public void parar() {
        state.parar(this);
    }

    public void iniciar() {
        state.iniciar(this);
    }

    public void enviar(String msg) {
        state.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
    }
    
    protected void setState(State state) {
        this.state = state;
    }
}
