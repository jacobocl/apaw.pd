package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    private static final String[] textValuesEs = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value, textValuesEs);
    }
}
