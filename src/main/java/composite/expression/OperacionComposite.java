package composite.expression;

public abstract class OperacionComposite extends Expresion {

    private Expresion expresion1;

    private Expresion expresion2;

    public OperacionComposite(Expresion expresion1, Expresion expresion2) {
        super();
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }
    
    protected Expresion getExpresion1() {
        return expresion1;
    }
    
    protected Expresion getExpresion2() {
        return expresion2;
    }

    @Override
    public String toString() {
        return "(" + expresion1 + operacion() + expresion2 + ")";
    }

    protected abstract String operacion();

}
