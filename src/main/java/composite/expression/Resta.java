package composite.expression;

public class Resta extends OperacionComposite {

    public Resta(Expresion expresion1, Expresion expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public int operar() {
        return getExpresion1().operar() - getExpresion2().operar();
    }

    @Override
    protected String operacion() {
        return "-";
    }

}
