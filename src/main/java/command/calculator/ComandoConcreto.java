package command.calculator;

import upm.jbb.IO;

public abstract class ComandoConcreto implements Comando {
    
    private Calculator calculator;

    public ComandoConcreto(Calculator calculator) {
        super();
        this.calculator = calculator;
    }
    
    protected Calculator getCalculator() {
        return calculator;
    }
    
    protected int obtainValor() {
        return IO.getIO().readInt();
    }

    @Override
    public abstract String name();

    @Override
    public abstract void execute();

}
