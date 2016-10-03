package state.connection;

public class Conexion {
    private Link link;
    
    private State state;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        //this.estado = Estado.CERRADO;
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return state.getEstado();
    }

    public void abrir() {
        state.abrir(this);
//        if (this.estado == Estado.CERRADO) {
//            this.estado = Estado.PREPARADO;
//        } else if (this.estado == Estado.PARADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PREPARADO) {
//        } else if (this.estado == Estado.ESPERANDO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else
//            assert false : "estado imposible";
    }

    public void cerrar() {
        state.cerrar(this);
//        if (this.estado == Estado.CERRADO) {
//        } else if (this.estado == Estado.PARADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PREPARADO) {
//            this.estado = Estado.CERRADO;
//        } else if (this.estado == Estado.ESPERANDO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        }
//        assert false : "estado imposible";
    }

    public void parar() {
        state.parar(this);
//        if (this.estado == Estado.CERRADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PARADO) {
//        } else if (this.estado == Estado.PREPARADO) {
//            this.estado = Estado.PARADO;
//        } else if (this.estado == Estado.ESPERANDO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        }
//        assert false : "estado imposible";
    }

    public void iniciar() {
        state.iniciar(this);
//        if (this.estado == Estado.CERRADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PARADO) {
//            this.estado = Estado.PREPARADO;
//        } else if (this.estado == Estado.PREPARADO) {
//        } else if (this.estado == Estado.ESPERANDO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        }
//        assert false : "estado imposible";
    }

    public void enviar(String msg) {
        state.enviar(this, msg);
//        if (this.estado == Estado.CERRADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PARADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PREPARADO) {
//            this.link.enviar(msg);
//            this.estado = Estado.ESPERANDO;
//        } else if (this.estado == Estado.ESPERANDO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        }
//        assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        state.recibir(this, respuesta);
//        if (this.estado == Estado.CERRADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PARADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.PREPARADO) {
//            throw new UnsupportedOperationException("Acción no permitida... ");
//        } else if (this.estado == Estado.ESPERANDO) {
//            if (respuesta == 0) {
//                this.estado = Estado.PREPARADO;
//            } else {
//                this.estado = Estado.CERRADO;
//            }
//        }
//        assert false : "estado imposible";
    }
    
    protected void setState(State state) {
        this.state = state;
    }
}
