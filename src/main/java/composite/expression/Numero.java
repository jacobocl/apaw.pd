package composite.expression;

public class Numero extends Expresion {

    private int valor;

    public Numero(int valor) {
        super();
        this.valor = valor;
    }

    @Override
    public int operar() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

}
