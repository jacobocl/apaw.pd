package memento.calculator;

import command.calculator.Calculator;

public class MementableCalculator extends Calculator implements Mementable<MementoCalculator> {

    @Override
    public MementoCalculator createMemento() {
        return new MementoCalculator(getTotal());
    }

    @Override
    public void restoreMemento(MementoCalculator memento) {
        setTotal(memento.getValor());
    }

}
