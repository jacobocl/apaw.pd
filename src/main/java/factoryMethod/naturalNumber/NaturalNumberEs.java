package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (super.getValue() < textValue.length) {
            return NaturalNumberEs.textValue[super.getValue()];
        } else {
            return "???";
        }
    }

}
